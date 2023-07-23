import java.util.Arrays;

public class Search_in_2D_Array {
    public static void main(String[] args) {
        int[][] arr={
                {223,4,7},
                {18,12,3,9},
                {78,-99,34,56},
                {108,12}
        };
        int target=34;
//        int[] ans=search_in_2D_Array(arr,12);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max_in_2D_Array(arr));
    }

    //Search an element from a 2-D array
    static int[] search_in_2D_Array(int[][] arr,int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target==arr[row][col]) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //Search for the maximum value from a 2-D array
    static int max_in_2D_Array(int[][] arr) {
        int max=arr[0][0];
        for (int row=1;row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                if (max<arr[row][col]) {
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
