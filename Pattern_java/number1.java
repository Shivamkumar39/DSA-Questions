import java.util.Scanner;

// public class number1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 int k = n-j+1;
//                 System.out.print(k); 
//             }
//             System.out.println();
//         }
//     }

// }
//output
// 4321
// 4321
// 4321
// 4321

//q2

// public class number1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){

//                 System.out.print(i); 
//             }
//             System.out.println();
//         }
//     }

// }
//output
// 1
// 22
// 333
// 4444

//q3
// public class number1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int num= 1;
//         for(int i=1; i<=n; i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }

// }
//output
// 1 2 
// 3 4 5
// 6 7 8 9 
// 10 11 12 13 14

//q4
public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num= 1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i+num;j++){
               System.out.print(j);
              
            }
            System.out.println();
        }
    }

}