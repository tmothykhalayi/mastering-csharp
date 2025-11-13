import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Removing elements in priority order
        System.out.println("Priority Queue elements (min-heap): ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
