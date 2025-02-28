public class leetcode_7 {
    public static void main(String[] args) {
        int n = 345;
        int ans = 0;
        while (n != 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }

        System.out.println(ans);
    }
}
