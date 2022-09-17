package exercises.lesson2.arraylist;
import java.util.ArrayList;
import java.util.Scanner;


public class FiveLetters {
//    public static String fiveLetters(ArrayList<String> arr){
    public static void main(String[] args){
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("Enter a word (or ENTER to finish): ");

        do {
            word = input.nextLine();
            if (word.length() == 5){
                fiveLetterWords.add(word);
            }
        } while(!word.equals(""));

        System.out.println(fiveLetterWords);

//            for(String str : strings) {
//                if (str.length() == 5){
//
//                }
            }
    }
