import java.util.*;
public class PatternArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        System.out.println("Enter the number of rows : ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col=sc.nextInt();
        String[][] arr1=new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                arr1[i][j]=" * ";
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
