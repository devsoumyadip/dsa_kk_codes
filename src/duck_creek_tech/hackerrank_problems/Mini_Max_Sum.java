package duck_creek_tech.hackerrank_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mini_Max_Sum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int[] newArr=new int[5];
        for(int i=0;i<5;i++){
            newArr[i]=arr.get(i);
        }
        Arrays.sort(newArr);

        long sum=0;
        for(int i=0;i<5;i++){
            sum+=newArr[i];
        }
        long[] sumArr=new long[5];
        for(int i=0;i<5;i++){
            sumArr[i]=sum-newArr[i];
        }
        Arrays.sort(sumArr);
        System.out.println(sumArr[0]+" "+sumArr[4]);
        System.out.println(Arrays.toString(sumArr));
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(256741038);
        list.add(623958417);
        list.add(467905213);
        list.add(714532089);
        list.add(938071625);
        System.out.println(list);
        miniMaxSum(list);
    }
}
