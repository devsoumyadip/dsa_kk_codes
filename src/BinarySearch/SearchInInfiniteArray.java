package BinarySearch;

import java.util.Arrays;

public class SearchInInfiniteArray {
    public static int searchInInfinite(int[] arr,int target){
        int s=0;
        int e=1;
        while(target>arr[e]){

                int newS=e+1;
                e=e+(e-s+1)*2;
                s=newS;
        }
        return bSearch(arr,target,s,e);
    }
    public static int bSearch(int[] arr,int target,int s,int e){
        while (s<=e){
            int m=s+(e-s)/2;
            if (target>arr[m]){
                s=m+1;
            } else if (target < arr[m]) {
                e=m-1;
            }
            else {
                return arr[m];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,11,15,21,25};
        int target=15;
        System.out.println((searchInInfinite(arr,target)));
    }
}
