
import java.util.Collections;
import java.util.Vector;

public class aloritham {
    public static void main(String[] args) {

        //we do binaray search using Vector STL (Standard Template Library)
    Vector<Integer> arr = new Vector<>();
    arr.add(1);
    arr.add(2);
    arr.add(5);
    arr.add(4);

    System.out.println("finding 4 at index : " +Collections.binarySearch(arr, 4));
    
    }
}
