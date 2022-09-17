package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradebookV2 {
    public static void main(String[] args){
        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        double studentID;
        String newStudent;

        System.out.println("Submit your student ID (or ENTER to finish):");

        do {
            System.out.print("Student name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")){
                System.out.print("Student ID: ");
                studentID = input.nextDouble();
                students.put(studentID, newStudent);

                input.nextLine();
            }

        } while(!newStudent.equals(""));

        System.out.println("\nClass Roster: " + students);

    }
}
