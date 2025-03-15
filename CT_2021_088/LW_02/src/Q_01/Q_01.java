package Q_01;

public class Q_01 {
    public static void main(String[] args) {
                // Define the variables
                // r for radius
                double A = 10.0,B=20.0,C=30.0,X=10.0,Y=5.0,r=7,PI=3.14;

                // a. The square root of B^2 + 4AC
                double outputA = Math.sqrt(Math.pow(B, 2)+4*A*C);
                System.out.println("The square root of B^2+4AC is: " +outputA);

                // b. The square root of X + 4Y^3
                double outputB = Math.sqrt(X+(4*Math.pow(Y, 3)));
                System.out.println("The square root of X+4Y^3 is: " + outputB);

                // c. The cube root of the product of X and Y
                double outputC = Math.cbrt(X*Y);
                System.out.println("The cube root of the product of X and Y is: " + outputC);

                // d. The area of a circle
                double area = PI*r*r;
                System.out.println("The area of the circle is: " + area);
            }
        }


