public class FindMin_Max {
    public static void main(String[] args) {
        int arr[] = {1000, 11,3001, 445, 100, 330, 3000};
        int n = arr.length;
        System.out.println("Minimum element of array: " + findmin(arr, n));
        System.out.println("Maximum element of array: " + findmax(arr, n));
    }

    public static int findmin(int arr[], int n){
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }


        return min;
    }
    public static int findmax(int arr[], int n){
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }


        return max;
    }
}
