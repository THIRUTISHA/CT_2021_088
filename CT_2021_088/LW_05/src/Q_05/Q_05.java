package Q_05;

import java.util.Scanner;

public class Q_05 {

    public static boolean isPalindrome(String word) {
        String reverseWord= "";
        for(int i = word.length() - 1; i >=0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        return word.equals(reverseWord);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word (only lowercase letters): ");

        String word = scanner.nextLine();

        if(isPalindrome(word)) {
            System.out.println("This word is palindrome! ");
        }
        else {
            System.out.println("This word is  not palindrome! ");

        }
        scanner.close();
    }

}
