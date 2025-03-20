

public class findlargestsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-9,15};
        int sum=0;
        int maxSum =Integer.MIN_VALUE;
        for(int i : arr){
            sum = Math.max(i,sum+i);
            maxSum = Math.max(maxSum, sum);    
        }
        System.out.println("arrray is: "+ maxSum);
    }
}
