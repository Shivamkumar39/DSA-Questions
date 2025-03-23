
import java.util.Stack;

public class stack_notes {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // LIFO concept
        // some funtion use in stack are:-
        /*
         * push(E item)-->  Pushes an element onto the stack
         * pop() --> Removes and returns the top element
         * peek() --> Returns the top element without removing it
         * isEmpty() --> Checks if the stack is empty
         * size() --> Returns the number of elements
         * search(Object o) --> Returns the position of an element (1-based index)
         * clear() --> Removes all elements
         */

         stack.push(3);
         stack.push(4);
         stack.push(1);
         stack.push(6);
         stack.push(7);
         stack.push(5);

         System.out.println("arr is: "+stack);
         //System.out.println("pop elemnt: " +stack.pop());
         System.out.println("peek elemnt: " +stack.peek());
         System.out.println("search elemnt at index"+stack.search(6));
         System.out.println("after perform all funtion: " +stack);

    }
}
