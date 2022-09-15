package exercises.lesson2;

public class StringArray {
    public static void main(String[] args){
        String poetry = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsArray = poetry.split(" ");
        System.out.println(wordsArray.length);
        String[] sentences = poetry.split(",");
        System.out.println(sentences[1]);
    }
}
