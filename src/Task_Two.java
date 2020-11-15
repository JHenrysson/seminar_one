import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_Two {
    public static void main (String[] args){
        int lowestNumber = 0;
        int userInput = 0;
        do {
            System.out.println("Enter a number");
            Scanner scanner = new Scanner(System.in);
            /* nextInt only accepts integers catches the error */
            try {
                userInput = scanner.nextInt();

                if (userInput != 0)
                    if (lowestNumber == 0 )
                        lowestNumber = userInput;
                    else if (userInput < lowestNumber)
                        lowestNumber = userInput;

            } catch (InputMismatchException e) {
                System.out.println("Not a valid number, try again");
            }
        }
        while (userInput != 0);

        System.out.println("The minimum number that you have entered was: " + lowestNumber);

    }
}
