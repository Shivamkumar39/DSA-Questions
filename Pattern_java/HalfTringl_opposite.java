package Pattern_java;

public class HalfTringl_opposite{
    public static void main(String[] args) {
        int n=5;

        for(int i =0; i<=n; i++){
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}