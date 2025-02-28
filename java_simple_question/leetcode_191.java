public class leetcode_191 {
    public static void main(String[] args) {
        int n=11;
        int count =0 ;
        while(n != 0){

            if((n & 1)==1){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
}
// Output: 3
// Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
// Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
