import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_Three {
    public static void main(String[] args) {
        int averageSpeed = 0;
        double remainingMileage = 0;
        int minutesLeft = 0;
        int hourLeft = 0;
        // two do-while loops are used to validate the inputs by the user
        // if they are both the correct format then program continues
        // if not an exception is thrown and user is prompted to enter a new value
        do {
            System.out.println("Enter the average speed <km/h>: ");
            Scanner scanner = new Scanner(System.in);
            try {
                averageSpeed = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not valid, try again");
            }

        } while (averageSpeed <= 0);
        do {
            System.out.println("Enter the remaining mileage <mile>: ");
            Scanner scanner = new Scanner(System.in);

            try {
                remainingMileage = scanner.nextInt() * 10; // 10 km = 1 mile converts km to mil
            } catch (InputMismatchException e) {
                System.out.println("Not valid, try again");
            }

        } while (remainingMileage <= 0);
        double time = remainingMileage / averageSpeed;  //divides the two numbers holds the length of time to travel

        // calculating the minutes by subtracting the hours from the time.
        // This means that if we had 2.3, we will now have 0.3.
        hourLeft = (int) Math.floor(time); // we get the hours by using floor to the nearest int == hours

        minutesLeft = (int) Math.round((time - hourLeft) * 60);  // round in case number is not even & Then multiply this number by 60 to get the minutes.


        System.out.println("Your remaining travel time is: " + hourLeft + " hour(s) and " + minutesLeft + " minutes.");
    }
}

