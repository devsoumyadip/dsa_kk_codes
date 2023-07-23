import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArr = new int[3][3];
        System.out.println(numArr.length);

        System.out.println("Enter nums :");
        //Input
        for (int row = 0; row < numArr.length; row++) {
            for (int col = 0; col < numArr[row].length; col++) {
                numArr[row][col] = sc.nextInt();
            }
        }
        //Output
        for (int row = 0; row < numArr.length; row++) {
            for (int col = 0; col < numArr[row].length; col++) {
                System.out.print(numArr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
