import java.util.Arrays;

public class swapArraywithindex {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5, 6};

        for(int i=0; i<arr.length; i+=2){
            if( i+1 <arr.length){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
            }
        }
        int swapedarr[] = arr.clone();
        System.out.println("Array after swapping: " + Arrays.toString(swapedarr));
    }
}
