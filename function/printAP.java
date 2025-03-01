
import java.util.Scanner;

public class printAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int n = sc.nextInt();
        printAP(n);
    }

    public static int printAP(int n) {
        if(n != 0){
            System.out.print(3 * n + 7);
        }
        return 0;
    }
}
