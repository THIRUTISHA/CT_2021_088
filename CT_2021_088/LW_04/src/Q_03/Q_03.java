package Q_03;

import java.util.Scanner;

public class Q_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a power of 10 (Example powers:-  6, 9, 12, 15, 18, 21, 30, 100): ");
            int power = scanner.nextInt();

            String numberName;
            switch (power) {
                case 6:
                    numberName = "Million";
                    break;
                case 9:
                    numberName = "Billion";
                    break;
                case 12:
                    numberName = "Trillion";
                    break;
                case 15:
                    numberName = "Quadrillion";
                    break;
                case 18:
                    numberName = "Quintillion";
                    break;
                case 21:
                    numberName = "Sextillion";
                    break;
                case 30:
                    numberName = "Nonillion";
                    break;
                case 100:
                    numberName = "Googol";
                    break;
                default:
                    numberName= null;
                    break;
            }
            if (numberName != null) {
                System.out.println("The number is a " + numberName + ".");
            } else {
                System.out.println("No corresponding word for 10 to the power of " + power + ".");
            }

            scanner.close();
        }
    }

