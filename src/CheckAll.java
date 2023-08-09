import java.util.ArrayList;

public class CheckAll  {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,8};
        int target=4;
        System.out.println(findAll(arr,target,0));
    }

    public static ArrayList<Integer> findAll(int[] arr,int target,int index){
        ArrayList<Integer> myList=new ArrayList<>();
        if(index== arr.length){
            return myList;
        }
        if (arr[index]==target){
            myList.add(index);
        }
        ArrayList<Integer> fromBelowCalls=findAll(arr,target,index+1);
        myList.addAll(fromBelowCalls);
        return myList;
    }
}
