
import java.util.Arrays;

public class tripletsum {
    public static void main(String[] args) {
        int arr[]= {2,4,6,9,9,15,19};
        int target = 20;
        int n=arr.length;
        tripletsum(arr, target, n);
        System.out.println();
       
    }
    public static void tripletsum(int arr[], int target, int n){
        Arrays.sort(arr);
        int sum=0;
        for(int i=0; i<n; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                sum = arr[i]+arr[left]+arr[right];
                if(sum == target){
                    System.out.println("Triplet is: "+arr[i]+" "+arr[left]+" "+arr[right]);
                    right--;
                    left++;
                }else if(sum <target){
                    left++;
                }else{
                    right--;
                }
                
            }
            
        }
        if (sum != target) {
            System.out.println("No triplets found.");
        }   
    }
}
