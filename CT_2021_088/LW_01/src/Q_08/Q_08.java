package Q_08;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter a string that contains a single exclamation mark:");
        String word= scanner.nextLine();

        int index = word.indexOf('!');

        System.out.println(word.substring(0, index));
        System.out.println(word.substring(index+2));
    }
}


