import java.util.Scanner;

public class MinumumAndMaximumChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();

        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();

    }
}


/*
Read the numbers from the console entered by the user and print the minimum and maximum
numbers the user has entered.
Before the user enters the number, print the message "Enter number:"
If the user enters an invalid number, break out of the loop and print
the minimum and maximum number.
Hint: use an endless while loop.

 */
