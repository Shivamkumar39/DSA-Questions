package Pattern_java;

public class sideHalfTringle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for(int k = 4; k>= i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();        
        }
    }
}

//     *
//    **
//   ***
//  ****
// *****