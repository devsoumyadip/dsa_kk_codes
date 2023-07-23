import java.lang.reflect.Array;
import java.util.*;

public class MultiDimArrList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        //Instantiating
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }
        //inserting elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list1);
    }
}
