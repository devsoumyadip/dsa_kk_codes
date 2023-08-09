package BinarySearch;

public class Ceiling {
    public static int srch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if (target>arr[mid]){
                s=mid+1;
            } else if (target < arr[mid]) {
                e=mid-1;
            }
            else {
                return mid;
            }
        }
        return arr[s];
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,7,11,56};
        int target = 10;
        System.out.printf("Ceiling of %d : %d",target,srch(arr,target));
    }
}
