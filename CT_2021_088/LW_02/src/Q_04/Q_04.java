package Q_04;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the body weight in pounds: ");
        double bodyWeight = scanner.nextDouble();

        // Calculate number of calories needs in one day
        double calories = bodyWeight * 19;
        System.out.println(calories + " calories");

    }
}
