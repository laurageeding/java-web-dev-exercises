package exercises2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer id;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("ID: ");
            id = input.nextInt();

            if (!id.equals("")) {
                System.out.print("Name: ");
                String name = input.nextLine();
                students.put(id, name);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!id.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
//        String sum;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
        }

//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);
    }
}
