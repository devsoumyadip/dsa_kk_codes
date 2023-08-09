package duck_creek_tech;

import java.util.Arrays;

public class Rotate_Array {
    public static void leftRotateByK(int[] arr,int k){
        for (int i = 0; i < k; i++) {
            leftRotateByOne(arr, arr.length);
        }
    }
    public static void leftRotateByOne(int[] arr,int n){
        int temp=arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i]=arr[i+1];

        }
            arr[n-1]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        leftRotateByK(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
