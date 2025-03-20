public class search_rotated_array {
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int k = 1;
        int n = arr.length;
        int pivot = findPivot(arr, 0, n - 1);
        
        int result;
        if (pivot == -1) { 
            // If there is no pivot, array is not rotated
            result = binarySearch(arr, 0, n - 1, k);
        } else if (k >= arr[pivot] && k <= arr[n - 1]) {
            result = binarySearch(arr, pivot, n - 1, k);
        } else {
            result = binarySearch(arr, 0, pivot - 1, k);
        }
        
        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int findPivot(int[] arr, int s, int e) {
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] >= arr[s]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
             mid = s + (e - s) / 2;
        }
        return -1;
    }

    //binary search
    public static int binarySearch(int[] arr, int s, int e, int key) {
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return -1;
    }
}
