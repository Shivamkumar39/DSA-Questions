public class StringLengthsg{
    public static void main(String[] args) {
        String name = "shivam kumar ";
        int z = name.length();
        System.out.println("Length of the string is: "+z);

        int abc = 0;
        for(int i=0;i<z;i++){
            if(name.charAt(i)=='a'){
                abc++;
            };
        };
        System.out.println("no of A char: "+abc);
        return;
        // prints "Hello, world!"
    }
}
