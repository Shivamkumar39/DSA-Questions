
import java.util.Scanner;

public class arrayexamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number size of array");
        int size = sc.nextInt();
        int num[] = new int[100];

        for(int i=0; i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("MAX value is: "+ getMax(num, size));
        System.out.println("MIN value is: "+ getMin(num, size));

    }
    
    public static int getMax(int num[], int n) {
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
    
    public static int getMin(int num[], int n) {
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
}
