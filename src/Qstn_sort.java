import Sorting.AllSort;

public class Qstn_sort {
    public static void main(String[] args) {
        int[] arr={3,4,1,61,12,7};
        sortC(arr);
    }
    static int sortC(int[] arr){

        //sorting the array
        int i=0;
        while(i<arr.length){
            int corrIndx=arr[i]-1;
            if (arr[i] != arr[corrIndx]){
                swap(arr,i,corrIndx);
            }
        }
        //search for the missing
        for (int j=0;j< arr.length;j++){
            if (arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
