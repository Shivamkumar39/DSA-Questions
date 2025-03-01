public class switchcase{
    public static void main(String[] args) {
        int n = 1550;
        int hundered = 0, fifty =0, twenty = 0, one = 0;
        switch (n/100) {
            case 0: 
                break;
            default:
                hundered = n/100;
                n = n%100;
        }
        switch (n/50) {
            case 0:
                
                break;
            default:
            fifty = n/50;
            n = n%50;
        }
        switch (n/20) {
            case 0:
                
                break;
            default:
            twenty = n/20;
            n = n%20;
        }
        switch (n/1) {
            case 0:
                
                break;
            default:
            one = n/1;
            n = n%1;
        }
        System.out.println("Hundered: "+hundered);
        System.out.println("Fifty: "+fifty);
        System.out.println("Twenty: "+twenty);
        System.out.println("One: "+one);
    }
}