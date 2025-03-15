package Q_03;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (1.8 * celsius) + 32;

        System.out.println(fahrenheit + " degrees Fahrenheit.");

    }
}



