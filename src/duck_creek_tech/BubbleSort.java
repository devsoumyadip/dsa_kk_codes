package duck_creek_tech;

public class BubbleSort {
    // Method to perform Bubble Sort on an array
    public static void sort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;  //array is already sorted
            }
        }
    }
public static void printArr(int[] arr){
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arr={6,7,1,15,9};
        System.out.println("before sorting");
        printArr(arr);
        sort(arr);
        System.out.println("after sorting");
        printArr(arr);
    }
}
