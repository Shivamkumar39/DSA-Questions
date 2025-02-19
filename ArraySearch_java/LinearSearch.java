

public class  LinearSearch{
    public static void main(String[] args) {
        int n[] = {5,6,7,8,9,10};
        int NumFind = 7;
        int index = LinearSearc(n, NumFind);
       
        
        if(index != -1){
             System.out.println("Number is found at index " + index);
        }else{
            System.out.println("not found in index");
        }
    }

    
        //linear search
    private static int LinearSearc(int[] n, int numFind) {
        // TODO Auto-generated method stub
       
        for(int i =0; i<n.length; i++){
            if(n[i] == numFind){
                return i;
            }
        }
        return 0;
    }



    private static int BinaraySearch(int[] n, int numFind){

        int left = 0;
        int right = n.length - 1;
        while(left <= numFind){
            int mid = (left + right)/2;
            if(n[mid] == numFind){
                return  mid;
            }else if(n[mid] < numFind){
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
  
}