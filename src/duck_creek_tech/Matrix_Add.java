package duck_creek_tech;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to add Two Matrices using Multi-dimensional Array.
public class Matrix_Add {
    public static int[][] add(int[][] m1,int[][] m2){
        int[][] ans=new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                ans[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return ans;
    }
    public static void print2D(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix : ");
        int size=sc.nextInt();

        int[][] m1=new int[size][size];
        int[][] m2=new int[size][size];

        System.out.println("Enter the elements of m1 matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the elements of m2 matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("m1 : ");
        print2D(m1);
        System.out.println("m2 : ");
        print2D(m2);
        System.out.println("m1 + m2 = ");
        print2D(add(m1,m2));
    }
}
