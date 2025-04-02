package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double inputCelsius = input.nextDouble();

        Temperature temperature = new Temperature(inputCelsius);
        System.out.println("The equivalent temperature in Fahrenheit: " + temperature.toFahrenheit());

        // Question Number2
        System.out.println("Enter the temperature in Fahrenheit to convert back to Celsius:");
        double inputFahrenheit = input.nextDouble();

        // Setting the temperature in Fahrenheit and converting back to Celsius
        temperature.setFahrenheit(inputFahrenheit);
        System.out.println("Converted back to Celsius: " + temperature.toCelsius());

    }
}

