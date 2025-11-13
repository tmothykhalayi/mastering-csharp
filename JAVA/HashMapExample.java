import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap (like unordered_map in C++)
        Map<String, Integer> scores = new HashMap<>();

        // Adding key-value pairs
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        // Accessing a value by key
        System.out.println("Alice's score: " + scores.get("Alice"));

        // Iterating through all entries in the map
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
