package exercises.lesson2;

public class ArrayNumbers {
    public static void main(String[] args) {
        int[] integersArray = {1, 1, 2, 3, 5, 8};
        for(int i=0; i < integersArray.length; i++) {
            if (integersArray[i] % 2 != 0) {
                System.out.println(integersArray[i]);
            }
        }
    }
}
