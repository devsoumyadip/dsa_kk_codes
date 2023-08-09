package BinarySearch;

import java.util.Arrays;

public class BS_in_2d_matrix {
    public static void main(String[] args) {
        int[][] matrix={
                {2,4,6},
                {8,10,12},
                {14,16,20}
        };
        System.out.println(Arrays.toString(foundAt(matrix,12)));
    }
    public static int[] foundAt(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        while (r<arr.length && c>=0){
           if (arr[r][c]==target){
               return new int[]{r,c};
           } else if (arr[r][c] < target) {
               r++;
           }
           else{
               c--;
           }
        }
        // if target not found
        return new int[]{-1,-1};
    }
}
