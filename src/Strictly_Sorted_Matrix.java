import java.util.Arrays;

public class Strictly_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int[][] matrix2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=6;
        System.out.println(Arrays.toString(BSInStrictly_sorted_matrix(matrix, target)));
    }
    static int[] simpleBS(int[][] matrix,int row,int cStart,int cEnd,int target){

        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid] < target) {
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] BSInStrictly_sorted_matrix(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;   //be cautious,matrix can be empty

        if (row==1){
            return simpleBS(matrix,0,0,col-1,target);
        }

        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;

        //run the loop till two rows are remaining
        while (rStart<(rEnd-1)) {   // while this is true it will have more than two rows
            int mid=rStart+(rEnd-rStart)/2;

            if (matrix[mid][mid]==target){
                return new int[]{mid,cMid};
            } else if (matrix[mid][mid]<target) {
                rStart=mid;
            }
            else {
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        // search in 1st half
        if  (target<=matrix[rStart][cMid-1]){
            return simpleBS(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd half
        if  (target<=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]){
            return simpleBS(matrix,rStart,cMid+1,col-1,target);
        }
        // search in 3rd half
        if  (target<=matrix[rStart+1][cMid-1]){
            return simpleBS(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4th half
        else {
            return simpleBS(matrix,rStart+1,cMid+1,col-1,target);
        }
    }
}
