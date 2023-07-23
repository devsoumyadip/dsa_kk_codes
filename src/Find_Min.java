public class Find_Min {
    public static void main(String[] args) {
        int[] arr={45,66,23,10,88,-96,82};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
