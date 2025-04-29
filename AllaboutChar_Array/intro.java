import java.util.Scanner;

public class intro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int length = getLength(name);
        System.out.println("Length of the name is: " + length);

        System.out.print("Reversed name is: ");
        reverse(name);
    }

    // Static method to get length of string
    public static int getLength(String name) {
        return name.length();
    }

    // Static method to reverse string
    public static void reverse(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println(); // move to new line
    }
}
