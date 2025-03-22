public class minmum_jump {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 10};
        int n = arr.length;

        int ans = minmum(arr, n);
        System.out.println("answer: " +ans);

    }
    public static int minmum(int[] arr, int n) {
        if(n <= 0){ 
           return 0;
        }
        if(arr[0] == 0) return -1;
        int maxreach = arr[0];
        int step = arr[0];
        int jump =1;
        for(int i=1; i<n; i++){
            if(i == n-1){
               return jump;
            }

            maxreach = Math.max(maxreach, i+arr[i]);
            step--;
            if(step == 0){
                jump++;
                if(i >= maxreach) return -1;
                step = maxreach - i;
                if (i == n - 1) return jump;
            }

        }
        return -1;

    }
}
