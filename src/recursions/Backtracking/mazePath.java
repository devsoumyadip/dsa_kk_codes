package recursions.Backtracking;

import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathDig("",3,3));

    }
    public static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    public static ArrayList<String> pathRet(String p,int r,int c){
        if (r==1 && c==1){
            ArrayList<String> pList=new ArrayList<>();
            pList.add(p);
            return pList;
        }
        ArrayList<String> pList=new ArrayList<>();
        if (r>1){
            pList.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c>1){
            pList.addAll(pathRet(p+'R',r,c-1));
        }
        return pList;
    }
    public static ArrayList<String> pathDig(String p,int r,int c){
        if (r==1 && c==1){
            ArrayList<String> pList=new ArrayList<>();
            pList.add(p);
            return pList;
        }
        ArrayList<String> pList=new ArrayList<>();
        if (r>1 && c>1){     // condition for diagonal movement
            pList.addAll(pathDig(p + 'D', r - 1, c-1));
        }
        if (r>1){
            pList.addAll(pathDig(p + 'V', r - 1, c));
        }
        if (c>1){
            pList.addAll(pathDig(p+'H',r,c-1));
        }
        return pList;
    }
}
