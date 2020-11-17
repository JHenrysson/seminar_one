import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variable to be used later
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("How many books do you have for shipping?");
            /* nextInt only accepts integers catches the error */
            try {
                userInput = scanner.nextInt();
                //checking that input is an int
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number, try again");
                scanner.next();
            }
        }
        //as long as user input is less than 1 we continue doing this process ^^
        while (userInput < 1);
        // calls method using userInput as parameter
        calculations(userInput);

    }
    private static void calculations(int userInput) { //method for calc

        // math ceil rounds up because if we get 2.2 --> it should round to three
        // b/c the extra boxes are needed
        // math.ceil returns a double && (int) it casts it to an int
        int numberOfBoxes = (int)Math.ceil(userInput / 5.0);
        int cost;
        if (numberOfBoxes <= 5) {  // if #boxes is less than or equal to 5 the cost is 8 sek
            cost = 8;
        } else
            cost = 5; // else 5 sek
        int total = numberOfBoxes * cost;
        int full;
        // used % to find remainder
        // if there is not a remainder we know all boxes are full
        // if there is a reminder it means the last box has XYZ books in it.
        int not_full = userInput %5;
        if (not_full == 0)
            full = numberOfBoxes;
        else
            // if full doesn't equal 0
            //we subtract 1 because we know the rest of the boxes must be filled
            full = numberOfBoxes - 1;
        System.out.print("You will receive " + numberOfBoxes + " box/es, " + full + " box/es containing 5 books ");
        // prints out how many books are in a "not full box"
        if (not_full > 0)
         System.out.println("and 1 box containing " + not_full + " book(s).");
        // prints total
        System.out.println("The shipping price will be: " + total + " SEK");
    }
}