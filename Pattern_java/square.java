import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print('*');
                System.out.print(' ');
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
        sc.close();
    }
}
