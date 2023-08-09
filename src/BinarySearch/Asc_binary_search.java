package BinarySearch;

// most optimal algorithm of searching when a sorted array is given
// time complexity ---> O(log n)
public class Asc_binary_search {
    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,10};
//        System.out.println(isFound(arr,534));
        System.out.println(foundAt(arr,9));
    }
    public static boolean isFound(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                return true;
            } else if (arr[mid]>target) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return false;
    }
    public static int foundAt(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if (arr[mid]>target){
                e=mid-1;
            } else if (arr[mid] < target) {
                s=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
