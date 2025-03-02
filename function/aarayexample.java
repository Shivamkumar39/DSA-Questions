
import java.util.Arrays;
import java.util.Scanner;

public class aarayexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr1 = {1, 2, 3, 4, 5, 6};

        int arr[] = { 100, 300, 100, 500 };
        System.out.println("Array is: " + Arrays.toString(arr));
        // sum of array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }
        System.out.println("sum of array " + sum);
        

        // search function call
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        boolean ans = search(arr, search);
        System.out.println(ans);

        // update funtion call
        int ans1 = update(arr);
    }

    // linear search
    public static boolean search(int arr[], int search) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index " + i + " and value is: " + arr[i]);

                return true;
            }
        }
        return false;
    }

    // updated value
    public static int update(int arr[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index to update: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.println("Enter the updated value: ");
            int value = sc.nextInt();
            arr[index] = value;
        } else {
            System.out.println("Invalid index");
        }

        int rpdatedarr[] = arr.clone();
        System.out.println("Updated array is: " + Arrays.toString(rpdatedarr));

        return 0;
    }
}
