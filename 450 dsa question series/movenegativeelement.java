
import java.util.Arrays;

public class movenegativeelement {
    public static void main(String[] args) {
        int arr[] = { 3, 5, -2, -4, 6, -8, 9 };
        int n = arr.length;
        negativeElement(arr, n);
        System.out.println("new array: " + Arrays.toString(arr));
    }

    public static void negativeElement(int[] arr, int n) {
        int left = 0;
        int right = 0;

        while (right < n) {
            if (arr[right] > 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;

            }
            right++;
        }
    }
}
