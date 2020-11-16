import java.util.Scanner;

public class Task_Three {
    public static void main(String[] args) {
        System.out.println("Enter the average speed <km/h>: ");
        Scanner scanner = new Scanner(System.in);
        int averageSpeed = scanner.nextInt();

        System.out.println("Enter the remaining mileage <mile>: ");
        double remainingMileage = scanner.nextInt() * 10;

        double hourAndMinute = remainingMileage / averageSpeed;

        int hourLeft = (int) Math.floor(hourAndMinute);

        int minutesLeft = (int) Math.round((hourAndMinute - hourLeft) * 60) ;

        System.out.println("Your remaining travel time is: + " + hourLeft + " hour(s) and " + minutesLeft + " minutes.");
    }
}
