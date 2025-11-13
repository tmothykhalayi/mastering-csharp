import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        // Creating an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Adding student names
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");

        // Printing the original list of students
        System.out.println("Original Student List: " + students);

        // Removing a student who left
        students.remove("Bob");
        System.out.println("After removing Bob: " + students);

        // Inserting a new student at a specific position
        students.add(1, "Eve");
        System.out.println("After adding Eve at index 1: " + students);

        // Iterating through the list using a for-each loop
        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }

        // Sorting the list alphabetically
        Collections.sort(students);
        System.out.println("Sorted Student List: " + students);
    }
}
