
import java.util.Scanner;

public class linearsearcharray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6};

        boolean ans = search(arr, search);
        System.out.println(ans);
        
    }

    public static boolean search(int arr[], int search){
       
        for(int i =0; i<arr.length; i++){
            if(arr[i]==search){
                System.out.println("Element found at index " + i);
                return true;
            }
        }
        return false;
    }
}
