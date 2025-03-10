import java.util.*;
public class interesectionArray {
    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>();

        //both array sorthed then we can use two pointer approach
        int[] arr1 = {1, 2, 2, 3, 4, 6};
        int i=0, j=0;
        int[] arr2 = {1, 2, 2, 4, 5, 6}; 
        int n= arr1.length;
        int m= arr2.length;
        

        //timecomplexity O(n+m) && two pointer approach
         while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }


        //timecomplexity O(n*m) && if array is not sorted then we can use this approach && brute force
        //if array is not sorted then we can use this approach
        /*for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr1[i]==arr2[j]){
                    if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i])
                    ans.add(arr1[i]);
                    break;
                }
                
            }
        }*/
        System.out.println(ans);
    }
}
