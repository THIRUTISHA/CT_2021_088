package Q_07;

import java.util.Scanner;

public class Q_07 {
    public static String replaceword(String sentence, String wordToReplace,String replacementWord){
        //split the sentense into an array of words
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++){
            if(words[i].equalsIgnoreCase(wordToReplace)){
                words[i]= replacementWord;
            }
        }
        return  String.join(" ",words);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the replace word: ");
        String wordToReplace = scanner.nextLine();

        System.out.println("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        String modifiedSentence = replaceword(sentence, wordToReplace,replacementWord);
        System.out.println("Modified sentense: \n"+modifiedSentence);

        scanner.close();

    }
}
