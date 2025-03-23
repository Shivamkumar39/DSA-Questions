
import java.util.Collections;
import java.util.Vector;

public class aloritham {
    public static void main(String[] args) {

        // we do binaray search using Vector STL (Standard Template Library)
        Vector<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        System.out.println("finding 4 at index : " + Collections.binarySearch(arr, 4));

        
        Collections.rotate(arr, 3);
        System.out.println("reverced arr: "+arr);
        System.out.println("max elemnt: "+Collections.max(arr));
        System.out.println("max elemnt: "+Collections.min(arr));

        // Note:-
        /*
         * C++ <algorithm>                Java Equivalent
         * sort(v.begin(), v.end())                Collections.sort(list)
         * reverse(v.begin(), v.end())             Collections.reverse(list)
         * min_element(v.begin(), v.end())         Collections.min(list)
         * max_element(v.begin(), v.end())          Collections.max(list)
         * binary_search(v.begin(), v.end(), x)    Collections.binarySearch(list, x)
         * count(v.begin(), v.end(), x)            Collections.frequency(list, x)
         * random_shuffle(v.begin(), v.end())         Collections.shuffle(list)
         */
    }
}
