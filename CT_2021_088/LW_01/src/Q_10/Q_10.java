package Q_10;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the odd length Word: ");
    String text = scanner.nextLine();

    int length = text.length();
    char middle_letter;
    middle_letter =  text.charAt((length / 2));
    System.out.println(middle_letter);


}
}

