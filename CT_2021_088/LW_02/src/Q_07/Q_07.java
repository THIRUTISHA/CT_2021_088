package Q_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        int weight = scanner.nextInt();
        System.out.print("Enter height in centimeters: ");
        int height = scanner.nextInt();

        // Calculate BMI using the formula
        double bmi =weight/Math.pow((height /100.0),2);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Your BMI is:" +df.format(bmi));
        if(bmi>20 && bmi<25)
            System.out.println("Your BMI is Normal");
        else
            System.out.println("Your BMI Outside the normal range");

    }
}


