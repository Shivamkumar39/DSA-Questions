public class dublicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 4};
        int ans =0;
        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i];
            
        }
        for(int i=1; i<arr.length; i++){
            ans= ans^i;
        }

        if(ans==0){
            System.out.println("No dublicate found");
        }
        else{
            System.out.println("Dublicate found" + ans);
        }
    }
}
