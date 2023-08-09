package BinarySearch;

public class PeakOfMountain {
    public static int peak(int[] arr){
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
        return e;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,1,0};
        System.out.println("peak index of mountain array : "+peak(arr));
    }
}
