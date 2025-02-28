public class leetcode_1281 {
    public static void main(String[] args) {
        int n=356;
        int sum = 0;
        int multi = 1;
        while (n != 0) {
            sum += n % 10;  // % module is use to get last number from degit 
            multi *= n % 10;
            n /= 10;
        }
        System.out.println(multi - sum);
    }
}
// Output: 76
// Explanation: For example, if the input is 1234, then the output should be 14.
// Explanation: For example, if the input is 4421, then the output should be 21.