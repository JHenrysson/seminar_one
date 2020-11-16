import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_Two {
    public static void main (String[] args){
        int lowestNumber = 0;
        int userInput = 0;
        // do while loop will only occur if while is true
        do {
            System.out.println("Enter a number");
            Scanner scanner = new Scanner(System.in);
            //nextInt only accepts integers catches the error
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number, try again");
            }
            // checking that it is not equal to zero because zero stops the program
            // and in this case 0 is not a number but causes an action in the program
            if (userInput != 0)
                // switches values of lowest number to userInput
                if (lowestNumber == 0 )
                    lowestNumber = userInput;
                // compares values and if userInput is less than lowestNumber
                // then lowest number equals userInput
                else if (userInput < lowestNumber)
                    lowestNumber = userInput;
        }
        while (userInput != 0);

        System.out.println("The minimum number that you have entered was: " + lowestNumber);

    }
}
