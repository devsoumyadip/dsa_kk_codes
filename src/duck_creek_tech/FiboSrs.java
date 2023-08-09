package duck_creek_tech;

import java.util.Scanner;

public class FiboSrs {
    public static int fiboRec(int n){
        if (n<=1){
            return n;
        }
        return fiboRec(n-1)+fiboRec(n-2);
    }
    public static void fiboLoop(int n){
        int f=0;
        int s=1;
        System.out.println("Fibonacci series of "+n+" terms : ");
        for (int i = 0; i < n; i++) {
            System.out.print(f+",");
            int next=f+s;
            f=s;
            s=next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        with recursion
//        for (int i = 0; i < n; i++) {
//            System.out.println(fiboRec(i));
//        }
//        with loop
       fiboLoop(n);
    }
}
