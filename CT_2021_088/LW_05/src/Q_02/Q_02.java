package Q_02;

import java.util.Scanner;

public class Q_02 {
            public static int noOfDigits(int number) {
                if (number == 0) {
                    return 1;
                }
                number = Math.abs(number);
                int count = 0;

                while (number > 0) {
                    number = number /10; // Remove the last digit
                    count++; // Increment the digit count
                }

                return count;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);;
                int input;
                do {
                    System.out.print("Enter an integer (negative to stop): ");
                    input = scanner.nextInt();

                    if (input >= 0) {
                        int digitCount = noOfDigits(input);
                        System.out.println("The number " + input +" has "+ digitCount +" digits.");
                    }

                } while (input >= 0);

                System.out.println("Program terminated.");
                scanner.close();
            }
}

