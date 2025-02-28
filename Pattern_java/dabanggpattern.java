import java.util.Scanner;

public class dabanggpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
                
            }
            for (int s=2; s<=i; s++) {
                 System.out.print("X"+" ");

             }
             for (int k=2; k<=i; k++) {
                System.out.print("X"+" ");

            }
            for (int p=n; p>=i; p--) {
                System.out.print(p+" ");

            }
           
            System.out.println();
        }
    }

}

//output
// 1 2 3 4 4 3 2 1 
// 1 2 3 X X 4 3 2
// 1 2 X X X X 4 3
// 1 X X X X X X 4 