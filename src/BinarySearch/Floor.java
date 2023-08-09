package BinarySearch;


public class Floor {
    public static int bSrch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (target>arr[mid]){
                s=mid+1;
            } else if (target < arr[mid]) {
                e=mid-1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[e];
    }

    public static void main(String[] args) {
        int[] arr={4,14,24,34,44,54,64,74};
        int target=33;
        System.out.printf("Floor of %d is : %d",target,bSrch(arr,target));
    }
}

