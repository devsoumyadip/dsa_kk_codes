package BinarySearch;

public class RotatedSortedArray {
    public static int searchInArray(int[] arr,int target){
        return 0;
    }
    public static int findPivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if (arr[m]>arr[m+1]){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,0,1,2};
//        System.out.println(searchInArray(arr,1));
        System.out.println(findPivot(arr));
    }
}
