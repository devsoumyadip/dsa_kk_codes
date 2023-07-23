import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array={5,69,78,9,10,2,30};
        bSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void bSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
