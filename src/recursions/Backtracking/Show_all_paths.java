package recursions.Backtracking;

import java.util.Arrays;

public class Show_all_paths {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true}
        };
        int[][] arr=new int[board.length][board[0].length];
        allPathPrint("",board,0,0,arr,1);
    }
    public static void allPathPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if (r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for (int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        //if cell not false or already visited
        maze[r][c]=false;

        path[r][c]=step;

        // conditions for movement
        if (r<maze.length-1){
            allPathPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if (c<maze[0].length-1){
            allPathPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if (r>0){
            allPathPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if (c>0){
            allPathPrint(p+'L',maze,r,c-1,path,step+1);
        }

        //after this line the function will get over
        //so before the function gets over, undo the changes that were made during execution of the function
        maze[r][c]=true;
        path[r][c]=0;
    }
}
