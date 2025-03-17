
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7,4,3,10};

        for(int i=0; i< arr.length -1; i++){
            int mininde =i;
            for(int j= i+1; j< arr.length; j++){
                if(arr[j] < arr[mininde]) {
                    mininde = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[mininde];
            arr[mininde] = temp;
        }

        System.out.println("sorted array using selection sor: "+ Arrays.toString(arr));
    }
}
