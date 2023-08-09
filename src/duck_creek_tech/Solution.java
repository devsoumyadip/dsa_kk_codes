package duck_creek_tech;

import java.util.* ;
import java.io.*;
public class Solution
{
    public static int factorial(int m){
        if(m==0){
            return 1;
        }
        return m*factorial(m-1);
    }
    public static int boringFactorials(int n, int p)
    {
        // Write your code here.
        return factorial(n)%p;
    }

    public static double myPow(double x, int n) {
        double ans=1;
        if(n>0){
            while(n>0){
                ans*=x;
                n--;
            }
        }else if(n<0){
            while(n<0){
                ans*=(1/x);
                n++;
            }
        }
        return ans;
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n=arr.size();
        float p=0f;
        float neg=0f;
        float z=0f;
        for(int i=0;i<n;i++){
            if(arr.get(i)==0){
                z++;
            }
            else if(arr.get(i)<0){
                neg++;
            }
            else{
                p++;
            }
        }
        System.out.println(Math.round((p/n)*1000000)/1000000);
        System.out.println(Math.round((neg/n)*1000000)/1000000);
        System.out.println(Math.round((z/n)*1000000)/1000000);
    }

    public static void main(String[] args) {

//        System.out.println(boringFactorials(18, 19));
//        System.out.println(myPow(2.1,3));
//        System.out.println(myPow(2,-2147483648));

    }
}
