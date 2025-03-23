
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        // min heap:- incresing order
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(40);
        minheap.add(10);
        minheap.add(30);
        minheap.add(20);
        minheap.add(50);

        // min heap:- decresing order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(50);

        System.out.println(minheap);
        System.out.println(maxHeap);
        int n = minheap.size();
        for (int i=0; i<n; i++) {
            System.out.println(minheap);
            minheap.poll();
            if(minheap.isEmpty()){
                System.out.println("true");
            }
        }
        /*
         * add(E e) / offer(E e) Adds an element to the queue
         * poll() Removes and returns the highest-priority element (smallest)
         * peek() Returns the highest-priority element without removing it
         * remove(E e) Removes a specific element
         * size() Returns the number of elements
         * isEmpty() Checks if the queue is empty
         */

        /*
         * 5. When to Use PriorityQueue?
         * ✅ Task Scheduling (e.g., CPU scheduling)
         * ✅ Dijkstra’s Algorithm (Shortest Path)
         * ✅ Huffman Encoding (Data Compression)
         * ✅ Event Handling (Processing high-priority events first)
         * 
         * Would you like an example of Dijkstra’s Algorithm using PriorityQueue? 🚀
         */
    }
}
