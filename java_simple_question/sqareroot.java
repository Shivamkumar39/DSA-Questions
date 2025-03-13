public class sqareroot {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(sqareroot(n));
    }
    public static int sqareroot(int n) {
        int s=0;
        int e = n;
        int mid = s+(e-s)/2;
        int ans = -1;

        while(s <= e){

            //mid*mid is greter that 2^31 then it show error the we multip two long number it show error due to pas this number beond 2^31
            // so need to use (long) in place of  (int)
            if(mid*mid == n){
                return  mid;
            }
            if(mid*mid < n){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
}
