public class Search_In_Range {
    static int linearSearchInRange(int[] arr,int target,int start, int end) {
        if (arr.length==0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element=arr[index];
            if (target==element) {
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={45,66,23,10,88,96,82};
        System.out.println(linearSearchInRange(arr,82,1,3));
    }
}
