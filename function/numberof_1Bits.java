
import java.util.Scanner;

public class numberof_1Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and cheak number of 1-bit");
        int n = sc.nextInt();
        System.out.println("Enter the number and cheak number of 1-bit");
        int p = sc.nextInt();
        int ans = hammingWeight(n, p);
         System.out.println(ans);
    }

    public static int hammingWeight(int n, int p) {
        int count = 0;
        while(n != 0 || p != 0){
            int bit = n & 1;
            int bits = p & 1;
            p = p >> 1;
            n = n >> 1;
            count +=( bit + bits);
            
        }
      

        return count;
    }

}
