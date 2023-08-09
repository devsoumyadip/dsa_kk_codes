package duck_creek_tech;

import java.util.Arrays;

//Write a Program to Reverse an Array
public class Reverse_Array {
    public static void reverseArray(int[] arr){
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
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
