import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput = 0;
        do {
            System.out.println("How many books do you have for shipping?");
            Scanner scanner = new Scanner(System.in);
            /* nextInt only accepts integers catches the error */
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number, try again");
            }
        }
        while (userInput < 1);
        int numberOfBoxes = (int) Math.ceil(userInput / 5.0);
        int cost;
        if (numberOfBoxes <= 5) {
            cost = 5;
        } else
            cost = 8;
        int total = numberOfBoxes * cost;

        int full;
        int not_full = userInput%5;
        if (not_full == 0)
            full = numberOfBoxes;
        else
            full = numberOfBoxes - 1;
        System.out.print("You will receive " + numberOfBoxes + " box/es, " + full + " box/es containing 5 books ");

        if (not_full > 0)
         System.out.println("and 1 box containing " + not_full + " books.");
    }
}