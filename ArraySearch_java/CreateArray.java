public class CreateArray {    
    public static void main(String args[]) {
        Myarray arr = new Myarray(6);
        arr.insertElement(1);
        arr.insertElement(2);
        arr.insertElement(3);
        arr.insertElement(4);
        arr.insertElement(5);
        arr.insertElement(6);

       // System.out.println(arr); // Calls overridden toString() method
        System.out.println(arr.findIndex(6));
    }    
}

class Myarray {
    private int[] item;
    private int currentIndex;

    public Myarray(int initialSize) {
        this.item = new int[initialSize];
        this.currentIndex = 0;
    }

    public void insertElement(int v) {
        if (currentIndex < item.length) { // Prevents out-of-bounds error
            this.item[this.currentIndex] = v;
            currentIndex++;
        } else {
            System.out.println("Array is full. Cannot insert more elements.");
        }
    }
    public int findIndex(int value){
        for(int i=0; i<item.length; i++){
            if(item[i] == value){
                System.out.println("Index of "+value+" is "+i);
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < currentIndex; i++) {
            sb.append(item[i]);
            if (i < currentIndex - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
