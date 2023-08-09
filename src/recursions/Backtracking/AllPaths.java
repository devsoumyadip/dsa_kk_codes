package recursions.Backtracking;

import java.util.ArrayList;

// thought process of backtracking :: make a change and revert it just before the function completes its execution
public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println(allPathList("",board,0,0));
    }
    public static void allPath(String p,boolean[][] maze,int r,int c){
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        //if cell not false or already visited
        maze[r][c]=false;

        // conditions for movement
        if (r<maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if (c<maze[0].length-1){
            allPath(p+'R',maze,r,c+1);
        }
        if (r>0){
            allPath(p+'U',maze,r-1,c);
        }
        if (c>0){
            allPath(p+'L',maze,r,c-1);
        }

        //after this line the function will get over
        //so before the function gets over, undo the changes that were made during execution of the function
        maze[r][c]=true;
    }

    public static  ArrayList<String> allPathList(String p,boolean[][] maze,int r,int c){
        if (r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if (!maze[r][c]){   //skip the false cell
            return list;
        }
        //if cell not false or already visited
        maze[r][c]=false;


        // conditions for movement
        if (r<maze.length-1){
            list.addAll(allPathList(p+'D',maze,r+1,c));
        }
        if (c<maze[0].length-1){
            list.addAll(allPathList(p+'R',maze,r,c+1));
        }
        if (r>0){
            list.addAll(allPathList(p+'U',maze,r-1,c));
        }
        if (c>0){
            list.addAll(allPathList(p+'L',maze,r,c-1));
        }

        //after this line the function will get over
        //so before the function gets over, undo the changes that were made during execution of the function
        maze[r][c]=true;
        return list;
    }
}
