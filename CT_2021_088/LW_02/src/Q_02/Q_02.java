package Q_02;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the length in centimeters: ");
                double length = scanner.nextDouble();
                // 1 inch = 2.54cm
                // Convert centimeters to inches
                double inches = length /2.54;

                // Convert inches to feet and remaining inches
                int feet = (int) (inches/12);
                int totalInches = (int) inches%12;

                System.out.println(feet + " feet and " + totalInches + " inches.");


            }
        }



