import java.util.Scanner;

// public class number2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=2;j<=i;j++){
//                System.out.print(" ");

//             }
//             for(int k=n; k>=i; k--){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }

// }
//output
// 1111
//  222
//   33
//    4

//ouestion2

// public class number2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=n; j>i;j--){
//                System.out.print(" ");

//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }

// }
//output
//    1
//   22
//  333
// 4444

//question 3
public class number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s=n; s>i;s--) {
                System.out.print(" "+ " ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                
            }
            for(int x=i-1; x>=1; x--){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

}