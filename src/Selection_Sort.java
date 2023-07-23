import java.util.Arrays;
public class Selection_Sort{
        public static void main(String[] args) {
                int[] arr={65,22,35,12,4,89,-36};
                int[] arr2={5,4,3,2,1};
                sSort(arr);
                System.out.println(Arrays.toString(arr));
        }
        static int getMaxIndex(int[] arr,int start,int end){
                int max=start;
                for (int i = start; i <= end; i++) {
                        if (arr[i]>arr[max]){
                                max=i;
                        }
                }
                return max;
        }
        static void swap(int[] arr,int first,int second){
                int temp=arr[first];
                arr[first]=arr[second];
                arr[second]=temp;
        }

        static void sSort(int[] arr){
                for (int i = 0; i < arr.length; i++) {
                        // Find the max index in the remaining array and swap with the right index
                        int last=arr.length-1-i;
                        int maxVal=getMaxIndex(arr,0,last);
                        swap(arr,maxVal,last);
                }
        }
}
