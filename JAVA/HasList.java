import java.util.*;
public class HasList {

    public static void main(String[] args) {
        // Creating a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Printing the HashMap
        System.out.println("Student Grades: " + studentGrades);

        // Accessing a specific value by key
        System.out.println("Bob's Grade: " + studentGrades.get("Bob"));

        // Updating a value
        studentGrades.put("Alice", 90); // Alice improved her grade
        System.out.println("Updated Student Grades: " + studentGrades);

        // Iterating through the map
        System.out.println("All Students and Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        if (studentGrades.containsKey("Charlie")) {
            System.out.println("Charlie is in the map.");
        }
    }
}


