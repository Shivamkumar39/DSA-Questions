
import java.util.Scanner;

//package java_simple_question;

public class sumofNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of first "+n+" number is "+sum);
    }
}
