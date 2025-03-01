package Q_11;
import java.util.*;


public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full name (order - first middle last) with spaces :");
        String text = scanner.nextLine();


        String[] parts = text.split(" ");
        String firstname = parts[0];
        String middlename = parts[1];
        String lastname = parts[2];

        System.out.println(lastname +","+" "+firstname+" "+middlename.charAt(0)+".");

    }
}


