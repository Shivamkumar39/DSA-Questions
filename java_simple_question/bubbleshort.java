import java.util.Arrays;

public class bubbleshort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 4, 6};
        
        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 1; j < arr.length - i; j++) { 
                if (arr[j] > arr[j + 1]) { 
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
