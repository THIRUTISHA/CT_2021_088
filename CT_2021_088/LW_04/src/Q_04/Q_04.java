package Q_04;

import java.util.Scanner;

public class Q_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }

            scanner.close();
        }

        // Method to determine if a year is a leap year
        public static boolean isLeapYear(int year) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

