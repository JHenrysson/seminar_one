import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaring variable to be used later
        int userInput = 0;
        do {
            System.out.println("How many books do you have for shipping?");
            Scanner scanner = new Scanner(System.in);
            /* nextInt only accepts integers catches the error */
            try {
                // checking that input is an int
                userInput = scanner.nextInt();
                // exception
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number, try again");
            }
        }
        // ^^ occurs if Userinput < 1
        while (userInput < 1);
        // calls method using userInput as parameter
        calculations(userInput);

    }
//method for calc
    private static void calculations(int userInput) {
        // math ceil rounds up because if we get 2.2 --> it should round to three
        // b/c the extra boxes are needed
        int numberOfBoxes = (int) Math.ceil(userInput / 5.0);
        int cost;
        // if #boxes is less than or equal to 5 the cost is 8 sek
        // else 5 sek
        if (numberOfBoxes <= 5) {
            cost = 8;
        } else
            cost = 5;
        int total = numberOfBoxes * cost;
        //
        int full;
        // used % to find remainder if there was not a remainder
        // full equals # of boxes
        int not_full = userInput %5;
        if (not_full == 0)
            full = numberOfBoxes;
        else
            //we subtract 1 because we know the rest of the boxes must be filled

            full = numberOfBoxes - 1;
        System.out.print("You will receive " + numberOfBoxes + " box/es, " + full + " box/es containing 5 books ");

        if (not_full > 0)
         System.out.println("and 1 box containing " + not_full + " book(s).");

        System.out.println("The shipping price will be: " + total + " SEK");
    }
}