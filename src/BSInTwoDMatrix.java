import java.util.Arrays;

public class BSInTwoDMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int[][] mat2={
                {1}
        };
        int target=0;
        System.out.println(Arrays.toString(BsearchInTwoD(matrix, target)));

    }
    static int[] BsearchInTwoD(int[][] arr,int target){          //each row is incrising,,each column is increasing
         int row=0;
         int col=arr.length-1;
         while(row< arr.length && col>=0){
             if (arr[row][col]==target){
                 return new int[]{row,col};
             } else if (arr[row][col] < target) {
                 row++;
             }
             else {
                 col--;
             }
         }
         return new int[]{-1,-1};
    }
}
