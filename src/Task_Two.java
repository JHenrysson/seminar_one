import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_Two {
    public static void main (String[] args){
       // the lowest number/userInput is set to 0 because it is not valid
        int lowestNumber = 0;
        int userInput = 0;

        do {
            System.out.println("Enter a number");
            Scanner scanner = new Scanner(System.in);
            //nextInt only accepts integers catches the error
            try {
                userInput = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Not a valid number, try again");
            }
            // checking that it is not equal to zero because zero stops the programn
            // and in this case 0 is not a "valid" number but causes an action in the program
            if (userInput != 0)
                if (lowestNumber == 0 )// here we have nothing to compare against
                    lowestNumber = userInput; // sets lowest number to userInput
                else if (userInput < lowestNumber)// if lowest number is not 0
                                                // compares values and if userInput is less than lowestNumber
                    lowestNumber = userInput;// then lowest number is set to userInput

        }//continues until the user enters 0
        while (userInput != 0);

        System.out.println("The minimum number that you have entered was: " + lowestNumber);

    }
}
