import java.util.Scanner;

public class ReverseArray {
    public void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers inward
            start++;
            end--;
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        int n = sc.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Reverse the array
        ReverseArray r = new ReverseArray();
        r.reverseArray(arr);
        
        sc.close();  // Close the scanner
    }
}
