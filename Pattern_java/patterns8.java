//package Pattern_java;

public class patterns8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//output
//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *