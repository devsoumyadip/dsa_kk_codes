package Sorting;

import java.util.Arrays;

public class AllSort {




    static void bubble(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void cycleS(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;  //correct index of arr[i].
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }
    }






    public static void main(String[] args) {
        int[] arr={-6,-99,5,1,99,12,36,14,7,37,9};
        int[] arr2={14,7,37,9};
        int[] arr3={-99,5,1,99,14,7,37,9};
        int[] arr4={3,2,1,5,4};
        bubble(arr);
        selection(arr2);
        insertion(arr3);
        cycleS(arr4);
        System.out.println("Bubble sort : "+Arrays.toString(arr));
        System.out.println("Selection sort : "+Arrays.toString(arr2));
        System.out.println("Insertion sort : "+Arrays.toString(arr3));
        System.out.println("Cycle sort : "+Arrays.toString(arr4));
    }
}
