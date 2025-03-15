package Q_08;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere in centimeter: ");
        double radius = scanner.nextDouble();

        // Calculate the volume of the sphere
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Given Radius: " + df.format(radius));
        System.out.println("The volume of the sphere: " + df.format(volume));

    }
}
