package exercises.lesson2.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

import static exercises.lesson2.arraylist.Method.sumEven;

public class Integers {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(100);
        numbers.add(8);
        numbers.add(3);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println(sumEven(numbers));
    }
}
