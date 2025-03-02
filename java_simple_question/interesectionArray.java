import java.util.*;
public class interesectionArray {
    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>();

        //both array sorthed then we can use two pointer approach
        int[] arr1 = {1, 2, 2, 3, 4, 6};
        int j=0;
        int i=0;
        int[] arr2 = {1, 2, 3, 4, 5, 6}; 
        int n= arr1.length;
        int m= arr2.length;
        
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(ans);
    }
}
