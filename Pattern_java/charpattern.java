
import java.util.Scanner;

public class charpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        char ch;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                ch = (char) ('A' + i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
//output
// A A A A A 
// B B B B B 
// C C C C C 
// D D D D D