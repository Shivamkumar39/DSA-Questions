import java.util.Arrays;

public class sort012 {
        public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sortArray(arr);
        System.out.println(Arrays.toString(arr)); // Correct way to print array
    }

    public static void sortArray(int[] arr) {

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid], move both pointers forward
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // If 1, just move mid forward
                mid++;
            } else {
                // Swap arr[mid] and arr[high], move high pointer backward
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }


   
}
