public class bookAllocation {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int n = arr.length;
        int m = 2; // m = number of student
        int s = 0;
        int sum = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int e = sum;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;

            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        System.out.println("possible min solution is: " + ans);
    }
    public static boolean isPossible(int[] arr, int n, int m, int mid) {
        int studentC = 1;
        int pagesum = 0;
        for (int i = 0; i < n; i++) {

            if (pagesum + arr[i] <= mid) {
                pagesum += arr[i];

            } else {
                studentC++;
                if (studentC > m || arr[i] > mid) {
                    return false;
                }
                pagesum = arr[i];
            }
        }
        return true;
    }
}
