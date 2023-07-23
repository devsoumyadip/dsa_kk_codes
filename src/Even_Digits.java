public class Even_Digits {
    public static void main(String[] args) {
        //find the number of integers that have even number of digits
        int[] arr={12,345,2,-3,7896,00};
        System.out.println(evenNumberDigits(arr));

    }
    static int evenNumberDigits(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                count++;
            }
        }
        return count;
    }
    //function to check whether a number contains even number of digits
    static boolean isEven(int num1){
        if (numOfDigits(num1)%2==0){
            return true;
        }
        return false;
    }
    static int numOfDigits(int num){
        if (num<0) {
            num=num*-1;
        }
        if (num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
   static int digits2(int num){
       if (num<0) {
           num=num*-1;
       }
        return (int)(Math.log10(num)+1);
   }
}
