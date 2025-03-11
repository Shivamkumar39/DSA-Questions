public class Peak_Index_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 11, 4, 2};
        int n= arr.length-1;
        int s = findPeakIndex(arr, n);
        System.out.println("Peak Index is: " + s);
    }
    public static int findPeakIndex(int[] arr,int n){
        int s = 0;
        int e = n;
        int mid = s+(e-s)/2;
        while(s<e){
            if(arr[mid] < arr[mid+1]){
                s = mid+1;
            }
            else{
                e=mid;
            }
            mid = s+(e-s)/2;
        }
        
        return s;
    }
}
