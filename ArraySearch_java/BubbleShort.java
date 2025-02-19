public class BubbleShort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;


        System.out.println("befour sorting");

        for(int x=0; x< n; x++){
            for(int y =0; y<n-1; y++){
                if(arr[y] > arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
       
        System.out.println("after sorting");
        for(int arrs : arr){
            System.out.println(arrs);
        }

        

    }
}
