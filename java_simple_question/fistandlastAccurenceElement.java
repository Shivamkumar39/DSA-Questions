import java.util.Arrays;

public class fistandlastAccurenceElement{
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 2, 8, 5};
        int target = 5;

        //this line sort the arrys
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int first = firstAcc(arr, target);
        int last = lastAcc(arr, target);

        System.out.println("First Occurrence of " + target + ": " + first);
        System.out.println("Last Occurrence of " + target + ": " + last);
    }

    public static int firstAcc(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                e = mid - 1; // Move left for first occurrence
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static int lastAcc(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1; // Move right for last occurrence
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
