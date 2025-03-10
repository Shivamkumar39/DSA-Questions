import java.util.Vector;
;

public class Pair_sum {
    public static void main(String[] args) {
        //List<Integer> ans = new ArrayList<>();
        Vector<Integer> ans = new Vector<>();
        int[] arr = {1, 2, 3, 4, 5};
        int s =6;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                Vector<Integer> temp = new Vector<>();
                if(arr[i]+arr[j]==s){
                    temp.add(arr[i]);
                    temp.add(arr[j]);                   
                }
                 ans.addAll(temp);
            }
        }
        System.out.println(ans);
    }
}
