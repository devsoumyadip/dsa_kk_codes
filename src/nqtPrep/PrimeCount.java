package nqtPrep;

import java.util.ArrayList;

public class PrimeCount {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,5);
        list.add(1,12);
        list.add(2,65);
        list.add(3,75);
        list.add(4,17);
        list.add(5,89);
        list.add(6,35);
        list.add(7,45);
        list.add(8,23);
        System.out.println(list);
        System.out.println(count(list));

    }
    public static int count(ArrayList<Integer> list){
        int s= list.size();
        int ans=0;

        for (int i = 0; i < s; i++) {
            if (checkPrime(list.get(i))){
                ans+=1;
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println();
        return ans;
    }
    public static boolean checkPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
