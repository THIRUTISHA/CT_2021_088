package Q_10;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        int MONTHS_IN_YEAR = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double Rate = scanner.nextDouble();

        System.out.print("Enter the loan period (in years): ");
        int loanPeriod = scanner.nextInt();

        double monthlyInterestRate = Rate / 100.0 / MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Monthly Payment:" +df.format(monthlyPayment));
        System.out.println("Total Payment:" +df.format(totalPayment));

    }
}


