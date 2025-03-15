
import java.util.Arrays;

public class findKmax_min_Element {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 77 ,2 , 9};
         int Kmin = 3;
         int kmax= 1;
        int n = arr.length;
        System.out.println(n);
      
        shortarray(arr, n);
        System.out.println("new array is: "+ Arrays.toString(arr));

        System.out.println("print 3nd max element: "+ arr[Kmin] );
        System.out.println("print 1nd min element: "+ arr[kmax] );
        
    }
    public static int shortarray(int[] arr, int n) {
        
      for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
      }
        

        return 0;
    }

}
