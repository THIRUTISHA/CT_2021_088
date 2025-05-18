package Q_06;

import java.util.Random;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100);
        int guessNumber;
        int attempts = 0;

        System.out.println("Welcome to the number guessing game!!");

        do {
            System.out.print("Enter your guessNumber(1 - 100): ");
            guessNumber =scanner.nextInt();
            attempts++;

            if (guessNumber>secretNumber) {
                System.out.println("This number higher than secretNumber! ");
            }
            else if(guessNumber< secretNumber){
                System.out.println("This number is lower than secretNumber! ");
            }else {
                System.out.println("Congratulations! You guessed the secretNumber correctly in "+ attempts +" attempts.\nThe secretNumber is "+ secretNumber);
            }

        }while (guessNumber!=secretNumber);
        scanner.close();
    }
}
