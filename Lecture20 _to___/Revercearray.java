
import java.util.Collections;
import java.util.Vector;

public class Revercearray {
    public static void main(String[] args) {
        Vector<Integer> set = new Vector<>();
        int[] arr = {1, 2, 3, 4, 5,2};
        for(int num : arr){
            set.add(num);
        }
        Collections.reverse(set);
        System.out.println(set);
    }
}
