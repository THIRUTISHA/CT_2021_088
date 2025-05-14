package Q_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //get user input
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Initialize smallest with the first number
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("The smallest number is: " + smallest);
        scanner.close();
    }


}