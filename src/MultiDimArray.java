import java.util.*;
public class MultiDimArray {
    static void changeNum(String strMatrix[]) {
        strMatrix[0]="Riya";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //syntax of a 2D array
        //data_type[][] variable_name=new data_type[no. of rows(mandatory)][no. of columns(not necessary)]
        int[][] matrix1=new int[3][];

        int[][] matrix2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i=0;i< matrix2.length;i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        String[] strMatrix=new String[3];
        strMatrix[0]="a";
        strMatrix[1]="b";
        strMatrix[2]="c";
//        System.out.println("Before func call");
//        for (int i = 0; i < strMatrix.length; i++) {
//            System.out.println(strMatrix[i]);
//        }
//        changeNum(strMatrix);
//        System.out.println("After func call");
//        for (int i = 0; i < strMatrix.length; i++) {
//            System.out.println(strMatrix[i]);
//        }
//        System.out.println("Enter any five alphabets : ");
//        String[] alph=new String[5];
//        for (int i = 0; i < alph.length; i++) {
//            alph[i]=sc.next();
//        }
//        for (int i = 0; i < alph.length; i++) {
//            System.out.println(alph[i]);
//        }
    }
}
