
import java.lang.*;
public class leetcode231{
    public static void main(String[] args) {
        int n= 1;

        for(int i=0; i<=30; i++){
            double ans = Math.pow(2,i);
            if(ans == n){
                System.out.println(true);
            }
            //System.out.println(false);
        }
    }
}