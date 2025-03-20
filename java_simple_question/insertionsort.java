import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionsortfun(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionsortfun(int[] arr) {
        for (int i = 1; i < arr.length; i++) { 
            int temp = arr[i]; 
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; 
                j--;
            }
            arr[j + 1] = temp; 
        }
    }
}
