
import java.util.ArrayList;
import java.util.List;

public class leetcode_442 {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();        
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};

        for(int i=0; i<arr.length; i++){
            int index = Math.abs(arr[i]) -1;
            if(arr[index]<0){
                ans.add(Math.abs(index+1));
            }
            arr[index] = -arr[index];
        }
        System.out.println(ans);

    }
}
