public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={2,4,6,12,20,33,40,56,69};
        int[] arr2={69,58,56,55,48,43,39,33,22,15,9,7};
        int target=41;
        System.out.println(binarySrch(arr,target));
        System.out.println(orderAgnosticBS(arr2,7));
    }

    static int binarySrch(int[] arr,int target){                 //for arrays which are sorted in ascending order
        int start=0;
        int end=arr.length-1;

        //searching for mid element
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    //peak element problem
    static int orderAgnosticBS(int[] arr,int target) {      // Irrelevant of sorting order
        int start=0;
        int end=arr.length-1;
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
}
