public class Qstn_sort {
    public static void main(String[] args) {

    }
    static int sortC(int[] arr){

        //sorting the array
        int i=0;
        while(i<arr.length){
            int corrIndx=arr[i]-1;
            if (arr[i] != arr[corrIndx]){
                AllSort.swap(arr,i,corrIndx);
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
}
