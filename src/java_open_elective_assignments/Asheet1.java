package java_open_elective_assignments;

import java.util.*;

public class Asheet1 {
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int start,int end){
        for(int i=start;i<end;i++){
            if (isPrime(i)){
                System.out.print(i+",");
            }
        }
    }

    public static int fibo(int n){
//        returns the nth fibonacci number
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void fiboSeries(int start,int end){
        for (int i = start; i < end; i++) {
            System.out.print(fibo(i)+",");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int num=5;
//        System.out.println(isPrime(num));
//        System.out.println("Enter the lower limit : ");
//        int start=sc.nextInt();
//        System.out.println("Enter the upper limit : ");
//        int end=sc.nextInt();
//        System.out.println("The prime numbers in the range are : ");
//        primeInRange(start,end);

        System.out.println(fibo(6));

    }
}
