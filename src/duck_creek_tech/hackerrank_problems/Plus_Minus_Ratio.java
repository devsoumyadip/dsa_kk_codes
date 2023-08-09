package duck_creek_tech.hackerrank_problems;

import java.util.ArrayList;
import java.util.List;

public class Plus_Minus_Ratio {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n=arr.size();
        double p=0f;
        double neg=0f;
        double z=0f;
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
        System.out.println(String.format("%.6f",p/n));
        System.out.println(String.format("%.6f",neg/n));
        System.out.println(String.format("%.6f",z/n));
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(-4);
        list.add(3);
        list.add(0);
        list.add(-9);
        list.add(4);
        list.add(1);

       plusMinus(list);
    }
}
