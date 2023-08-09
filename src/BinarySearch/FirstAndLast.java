package BinarySearch;

import java.util.Arrays;

public class FirstAndLast {
    public static int[] searchRange(int[] arr,int target){
        int start=bSearch(arr,target,true);
        int end=bSearch(arr,target,false);
        return new int[]{start,end};
    }
    public static int bSearch(int[] arr,int target,boolean isStart){
        int s=0;
        int e=arr.length-1;

        int ans=-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if (target<arr[m]){
                e=m-1;
            } else if (target > arr[m]) {
                s=m+1;
            }
            else{
                ans=m;
                if (isStart){
                    e=m-1;
                }
                else {
                    s=m+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=88;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
}
