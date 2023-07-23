import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//application of cyclic sort
//asked in google [leet-448]
public class Disappearing_Nums {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 3, 2, 1};
        int[] arr2 = {4, 5, 3, 2, 1};
        ;
//        System.out.println(Arrays.toString(findAllMissing(arr)));
    }

    static List<Integer> findAllMissing(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j-1){
                ans.add(j-1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}