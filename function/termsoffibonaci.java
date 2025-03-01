
import java.util.Scanner;

public class termsoffibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
       // System.out.println(n);
    }

    public static int fib(int n) {
        int a=0,b=1;
        int count=0;
        if (n <= 0) {
            return 0;
        }
        while(a <= n){
            count++;
           // System.out.print(a+" ");
            int sum = a+b;
            a=b;
            b=sum;
        }
        return count;

    }
    
}
