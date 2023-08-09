package duck_creek_tech;

//10. How is the merge sort algorithm implemented?
//merge sort : a divide and conquer approach
// Time complexity : O(n log n)
                // for divide : O(log n)
                // for conquer : O(n)
public class Merge_Sort {
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] merged=new int[ei-si+1];

        int idx1=si;       //index for tracking 1st array
        int idx2=mid+1;     //index for tracking 2nd array
        int x=0;         //index for tracking merged array

        while (idx1<=mid && idx2<=ei){
            if (arr[idx1]<=arr[idx2]){    //1st array contains smaller element
                merged[x]=arr[idx1];      //putting 1st elem of 1st arr in merged
                x++;
                idx1++;
            }
            else {            //2nd arr contains smaller elem
                merged[x]=arr[idx2];  // put 1st elm of 2nd arr into merged
                x++;
                idx2++;
            }
        }
        while(idx1<=mid){   // if 1st array containing elems but 2nd array finishes
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while (idx2<=ei){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }

        //copying the elements of merged to original arr
        for (int i = 0,j=si; i < merged.length; i++,j++) {
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr,int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    public static void main(String[] args) {
        int[] arr={0, 1 ,2, 2, 1, 0};
        printArr(arr);
        divide(arr,0,arr.length-1);
        printArr(arr);
    }
}
