package duck_creek_tech;

import java.util.Arrays;
import java.util.HashMap;

public class Replace_By_Rank {
    public static void replaceByRank(int[] arr){
        int[] sortedarr= arr.clone();
        Arrays.sort(sortedarr);

        HashMap<Integer,Integer> rankMap=new HashMap<>();
        int rank=1;

        for(int i:sortedarr){
            if (!rankMap.containsKey(i)){
                rankMap.put(i,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=rankMap.get(arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr={5,1,9,2,8};
        System.out.println(Arrays.toString(arr));
        replaceByRank(arr);
        System.out.println(Arrays.toString(arr));
    }
}
