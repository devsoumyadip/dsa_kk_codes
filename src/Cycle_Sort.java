import java.util.Arrays;

// usage : when the given array is of size N and the elements of the array is also from  1-N
public class Cycle_Sort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        cSort(nums,5);
        System.out.println(Arrays.toString(nums));

        int[] Mnums={3,4,1,0};
        System.out.println(findMissing(Mnums));
    }
    static void cSort(int[] arr,int n){
        int i=0;
        while(i<n){
            int correctIndx=arr[i]-1;
            if (arr[i] != arr[correctIndx]){
                swap(arr,i,correctIndx);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    //find missing numbers from an array of distinct numbers of[0-n]
    static int findMissing(int[] arr){
        int i=0;

        //sorting array
        while(i<arr.length){
            int correctIndx=arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correctIndx]){
                swap(arr,i,correctIndx);
            }
            else{
                i++;
            }
        }
        //search for the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
}
