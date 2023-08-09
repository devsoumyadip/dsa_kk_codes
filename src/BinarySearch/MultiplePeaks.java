package BinarySearch;

public class MultiplePeaks {
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
    public static int orderAgnosicBsrch(int[] arr,int target,int s,int e){

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
    public static int searchInMountain(int[] arr,int target){
        int peak=peak(arr);
        if (orderAgnosicBsrch(arr,target,0,peak)!=-1){
       return (orderAgnosicBsrch(arr,target,0,peak));
    }
        return orderAgnosicBsrch(arr,target,peak+1,arr.length-1);
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        System.out.println(searchInMountain(arr,3));
    }
}
