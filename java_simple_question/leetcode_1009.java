public class leetcode_1009 {

    public static void main(String[] args) {
        int n = 10;
        int k = n;
        int m = 0;

        //important
        if(n == 0){
            System.out.println(1);
        }
        while( k != 0){
            m = (m << 1) | 1;
            k = k >> 1;

        }
        int ans = (~n)& m;
        System.out.println(ans);

    }
}


//important question
