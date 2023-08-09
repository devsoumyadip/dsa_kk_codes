package BinarySearch;

public class Order_Agnostic_BS {
    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,10};
        int[] arr2={65,55,45,35,25,15,5};
        System.out.println(orderAgnosicBsrch(arr2,65));
    }

    public static int orderAgnosicBsrch(int[] arr,int target){
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            boolean isAsc=arr[s]<arr[e];
            if (isAsc){
                if (arr[m]<target){
                    s=m+1;
                } else if (arr[m] > target) {
                    e=m-1;
                }
                else {
                    return m;
                }
            }
            else{
                if (arr[m]>target){
                    s=m+1;
                } else if (arr[m] < target) {
                    e=m-1;
                }
                else {
                    return m;
                }
            }
        }
        return -1;
    }
}
