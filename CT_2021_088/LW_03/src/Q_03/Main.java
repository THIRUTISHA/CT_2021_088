package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for outer and inner circle radius
        // ro - outer circle radius
        // ri - inner circle radius
        System.out.print("Enter the radius of the outer circle: ");
        double ro = scanner.nextDouble();
        System.out.print("Enter the radius of the inner circle: ");
        double ri = scanner.nextDouble();

        Circle outerCircle = new Circle(ro);
        Circle innerCircle = new Circle(ri);
        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("The Area of the outer circle is : "+df.format(outerCircle.computeArea()));
        System.out.println("The Area of the inner Circle is : "+df.format(innerCircle.computeArea()));
        System.out.println("The Area of the circular region (shaded area) is : "+df.format(shadedArea));

    }
}
