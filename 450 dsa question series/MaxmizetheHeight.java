//Minimise the maximum difference between heights [V.IMP]

import java.util.Arrays;

public class MaxmizetheHeight {
    public static void main(String[] args) {
        
        int arr[]= {1, 5, 9, 8, 16, 20}; 
        int k =2;
        Arrays.sort(arr);
        int n = arr.length;
        int result = arr[n-1] - arr[0];
        int small = arr[0]+k;
        int large = arr[n-1] - k;
        int min;
        int max;
        for(int i=0; i<n-i; i++){
            min = Math.min(small, arr[i+1] -k);
            max = Math.max(large, arr[i]+k);
            if(min < 0) continue;
            result = Math.min(result, max-min);
        }
        System.out.println("is: "+ result);
    }   
}
