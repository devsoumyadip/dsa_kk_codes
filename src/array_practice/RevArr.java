package array_practice;

import java.util.Arrays;

public class RevArr {
    public static void revArr(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3,9,7};
        System.out.println("before rev ="+Arrays.toString(digits));
        revArr(digits);
        System.out.println("after rev ="+Arrays.toString(digits));
    }
}
