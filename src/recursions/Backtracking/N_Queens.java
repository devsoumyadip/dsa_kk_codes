package recursions.Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(nQueens(board,0));
    }
    public static int nQueens(boolean[][] board,int row){
        //if all rows are traversed, print the board and return
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        //initial number of possible solutions
        int count =0;

        //placing the queens
        //checking for every row and column
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board,row,col)){
                //marking true if found a safe cell
                board[row][col]=true;
                count += nQueens(board,row+1);
                // reverting the cell to its original condition, for other solutions & if any sol not found after placing in the referenced cell
                board[row][col]=false;
            }
        }

        //returning the final result
        return count;
    }
    private static boolean isSafe(boolean[][] board,int row,int col){
        //func for checking, if a queen is safe on the cell where it is placed
        //check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxLeft=Math.min(row,col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxRight=Math.min(row,board.length-col-1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board){    //function for printing the board
        for (boolean[] row:board){
            for (boolean element:row){
                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
