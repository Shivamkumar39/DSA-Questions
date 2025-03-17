import java.util.*;

public class find_Union_Intersection_ofTwoArray{
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 8, 10};
        int arr2[] = { 4, 6, 8, 7, 9};

        int ans1[] = Union(arr1, arr2);
        System.out.println("union of two array is: " + Arrays.toString(ans1));
        int ans2[] = intersection(arr1, arr2);
        System.err.println("Intersection is: " + Arrays.toString(ans2));
        
        
    }
    public static int[] Union(int[] arr1, int[] arr2) {
        HashSet<Integer> arr = new HashSet<>(); //ensures uniqueness of elements and automatically removes duplicates.

        for(int nums : arr1){
            arr.add(nums);
        }

        for(int nums : arr2){
            arr.add(nums);
        }

        int result[] = new int[arr.size()];
        int index = 0;
        for(int num : arr){
            result[index++] = num;
        }
        return result;
    }
    public static int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> arr = new HashSet<>(); //ensures uniqueness of elements and automatically removes duplicates

        for( int num : arr1){
            for(int num1 : arr2){
                if(num == num1){
                    arr.add(num);
                }
            }
        }

        int result[] = new int[arr.size()];
        int index = 0;
        for(int num : arr){
            result[index++] = num;
        }
        return result;
    }
}