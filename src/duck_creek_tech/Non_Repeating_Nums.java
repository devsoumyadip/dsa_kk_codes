package duck_creek_tech;

import java.util.HashMap;
import java.util.Map;

//Write a code to find non-repeating elements in an array.
public class Non_Repeating_Nums {
    public static void findNonRepeatingNums(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if (e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5,6,6};
        findNonRepeatingNums(arr);
    }
}
