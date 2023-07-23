public class BS_in_InfiniteArray {
    public static int bsrch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int bSrchInInfinite(int[] arr,int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return bsrch(arr,target,start,end);
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,11,15,21,25};
        int target=15;
        System.out.println(bSrchInInfinite(arr,target));
    }
}
