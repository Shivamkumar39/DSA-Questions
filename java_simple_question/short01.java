import java.util.Arrays;

//using two pointer approch
public class short01 {
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 0, 0, 1, 0, 1, 0, 1};
        int n = a.length;
        arrayListss(a, n);
        System.out.println(Arrays.toString(a)); // Correctly prints the sorted array
    }

    public static void arrayListss(int[] a, int n) {
        int left = 0, right = n - 1;

        while (left < right) {
            // Move left forward if it already has a 0
            while (left < right && a[left] == 0) {
                left++;
            }
            // Move right backward if it already has a 1
            while (left < right && a[right] == 1) {
                right--;
            }
            // Swap elements if left < right
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }
}
