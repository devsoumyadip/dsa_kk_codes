public class Peak_Element {
    public static int findPeakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){   //desc part of the arr
                end=mid;
            }
            else {    //asc part of arr
                start=mid+1;
            }
        }
        return start;
    }
    public static int findAns(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int peak=findPeakIndex(arr);
        int firsTry=bsrch(arr,target,start,peak);
        if (firsTry != -1){
            return firsTry;
        }
        else {
            return bsrch(arr,target,peak+1,end);
        }
    }
    public static int bsrch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid = start + (end - start) / 2;
            boolean isAsc=arr[start]<arr[end];
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else if(arr[mid]==target){
                return mid;
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,1,3,6,4,2,1};
        System.out.println(findPeakIndex(arr));
        System.out.println(findAns(arr,6));
    }
}
