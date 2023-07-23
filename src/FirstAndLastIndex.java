//34.
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr={4,5,7,7,7,7,9,10,12};
        int target=7;
        System.out.println(findFirstAndLastIndex(arr,target));
    }
    static int[] findFirstAndLastIndex(int[] nums,int target){
        int start=bSearch(nums,target,true);
        int end=bSearch(nums,target,false);
        int[] ans={start,end};
        return ans;
    }

    //func. of binary search
    static int bSearch(int[] arr,int target,boolean isStart){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }
            else {
                ans=mid;
                if (isStart){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
