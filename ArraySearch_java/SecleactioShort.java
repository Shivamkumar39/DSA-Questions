public class SecleactioShort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int minIndex = -1;

        System.out.println("befour sorting");

        for(int x=0; x< n-1; x++){
            minIndex = x;
            for(int y = x+1; y<n-1; y++){
               if(arr[minIndex]  >  arr[y]){
                minIndex = y;
               }

               int temp = arr[minIndex];
               arr[minIndex] = arr[x];
               arr[x] = temp;
            }
        }
       
        System.out.println("after sorting");
        for(int arrs : arr){
            System.out.println(arrs);
        }

        

    }
}

