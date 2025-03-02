
import java.util.Arrays;

public class leetcodethirs_max {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 3, 1 };
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        int arr[] = nums.clone();
        System.out.println("Third Maximum Number: " + Arrays.toString(arr));
    }

}
