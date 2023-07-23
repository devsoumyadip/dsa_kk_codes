public class LinearSearch {
    static int linearSearch(int[] arr,int target) {
        if (arr.length==0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (target==element) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,78,6,75,36,69};
        System.out.println(linearSearch(arr,69));

    }
}
