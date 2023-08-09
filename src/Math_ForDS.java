public class Math_ForDS {
    public static void main(String[] args) {
//        System.out.println(isPrime(23));
//        System.out.println(isOdd(55));

        int[] arr={6,5,4,5,4,3,3,6,9};
        System.out.println(findUnique(arr));
//        System.out.println(getBit(100,3));
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

    static boolean isOdd(int n){
        return (n & 1)==1;  //n & 1 should return 1 or 0
    }

    static int findUnique(int[] arr){
        int unique=0;

        for (int i = 0; i < arr.length; i++) {
            unique ^=arr[i];
        }

        return unique;
    }

    static int getBit(int n,int bit){
        return (n & 1<<(bit-1));
    }
}
