package Q_05;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Fahrenheit  :");
        double temp =scanner.nextDouble();

        // Convert  degrees Fahrenheit to degrees Celsius using the formula
        double celsius = (5.0/9.0)*(temp- 32);

        System.out.println(celsius+ " degrees celsius.");

    }
}
