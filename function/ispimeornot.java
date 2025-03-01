
import java.util.Scanner;

public class ispimeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int n = sc.nextInt();

       if(isPrime(n)){
           System.out.println("The number is prime");
       }else{
           System.out.println("The number is not prime");
       }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}