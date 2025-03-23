
import java.util.HashSet;
import java.util.Set;

public class Hashset_note {
    public static void main(String[] args) {
        // Create a HashSet
        // Set:- A Set is a collection that does not allow duplicate elements and does
        // not maintain insertion order
        /*
         * HashSet – Fastest, unordered, based on hashing.
         * 
         * LinkedHashSet – Maintains insertion order.
         * 
         * TreeSet – Sorted in ascending order (uses a Red-Black tree).
         */

        /*
         * add(E e) Adds an element (ignores duplicates)
         * remove(Object o) Removes a specific element
         * contains(Object o) Checks if an element exists
         * isEmpty() Checks if the set is empty
         * size() Returns the number of elements
         * clear() Removes all elements
         * iterator() Returns an iterator to loop through elements
         */

        Set<String> set = new HashSet<>();
        set.add("shivam");
        
        set.add("himan");
        set.add("isha");
        set.add("vikram");
        set.add("ashish");
        set.add("m");
        int n = set.size();
        System.out.println(n);
        System.out.println(set);
        System.out.println(set.contains("v"));

    }
}
