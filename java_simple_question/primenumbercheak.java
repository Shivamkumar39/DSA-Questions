
import java.util.Scanner;

public class primenumbercheak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("This is not a prime number");
        }else{
            System.out.println("This is a prime number");
        }
    }
}
