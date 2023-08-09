package matrixQuestions;

import java.util.Arrays;

public class DiagonalOfMatrix {
    public static int[] diagonal(int[][] arr){

        int row= arr.length;
        int col= arr[0].length;
        int[] primDig=new int[row];
        int[] secondDig=new int[row];

        int k=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i==j){
                    primDig[k]=arr[i][j];
                    k++;
                }

            }
        }
        return primDig;
    }
    public static void main(String[] args) {
        int[][] arr={
                {2,5,8},
                {7,4,1},
                {3,6,9}
        };
        System.out.println(Arrays.toString(diagonal(arr)));
    }
}
