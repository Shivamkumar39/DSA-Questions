import java.util.ArrayDeque;
import java.util.Deque;

public class deque_notes {
    public static void main(String[] args) {
        Deque<Integer> arr = new ArrayDeque<>();

        // FILO concept
        /*
         * addFirst(E e) --> Adds an element at the front
         * addLast(E e) --> Adds an element at the rear
         * offerFirst(E e) --> Inserts at front (returns true/false)
         * offerLast(E e) --> Inserts at rear (returns true/false)
         * removeFirst() --> Removes and returns the front element
         * removeLast() --> Removes and returns the last element
         * pollFirst() --> Retrieves and removes the front element (returns null if empty)
         * pollLast() --> Retrieves and removes the last element (returns null if empty)
         * getFirst() --> Retrieves the front element without removing it
         * getLast() --> Retrieves the last element without removing it
         * peekFirst() --> Retrieves front without removal (null if empty)
         * peekLast() --> Retrieves last without removal (null if empty)
         * isEmpty() --> Checks if the deque is empty
         * size() --> Returns the number of elements
         * clear() --> Removes all elements
         * contains(Object o) --> Checks if a specific element exists
         */
        arr.add(10);
        arr.add(1);
        arr.add(5);
        arr.add(8);

        System.out.println(arr);

        System.out.println(arr.size());

        System.out.println(arr.isEmpty());
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.offerFirst(7));
        System.out.println(arr.offerLast(20));
        System.out.println(arr);
    }
}
