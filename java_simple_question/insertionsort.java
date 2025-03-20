public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        insertionsortfun(arr);
    }

    public static void insertionsortfun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                }else{
                    break;
                }
                arr[j + 1] = temp;
            }
        }
    }
}
