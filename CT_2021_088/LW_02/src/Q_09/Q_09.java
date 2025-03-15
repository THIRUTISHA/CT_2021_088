package Q_09;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                // user inputs
                System.out.print("Enter the principal amount in dollars: ");
                double P = scanner.nextDouble();
                System.out.print("Enter the interest rate in percentage: ");
                double R = scanner.nextDouble();
                System.out.print("Enter the number of years: ");
                int N= scanner.nextInt();

                double amount = P*Math.pow((1+(R/100)),N);
                double moneyEarned = amount-P;
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println("The money earned after "+N+" years is: "+df.format(moneyEarned)+" dollers" );

            }
}
