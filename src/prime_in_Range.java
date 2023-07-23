import java.util.Arrays;

public class prime_in_Range {
    public static void main(String[] args) {
        int lower_lim=10;
        prime(lower_lim);
    }
    static void prime(int uLim){
        int[] arr =new int[uLim];
        if(uLim<2){
            System.out.println("0");
        }
        for (int i = 2; i < uLim; i++) {
            boolean isPrime=true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+",");
            }
        }
    }
}
