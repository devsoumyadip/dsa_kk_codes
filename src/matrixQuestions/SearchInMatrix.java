package matrixQuestions;


public class SearchInMatrix {
    public static boolean check(int[][] arr,int target){
        int row= arr.length;
        int col= arr[0].length;
        if (row==0 || col ==0){
            return false;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr={
                {2,5,8},
                {7,4,1},
                {3,6,9}
        };
        boolean result=check(arr,1);
        if (result){
            System.out.println("Yes. The number exists in the matrix");
        }else {
            System.out.println("No. The number does not exists in the matrix");
        }
    }

}
