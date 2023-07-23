public class QstnOf12kk {
    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr1,int idx1,int idx2) {
        int temp=arr1[idx1];
        arr1[idx1]=arr1[idx2];
        arr1[idx2]=temp;
    }
    static int max(int[] arr) {
        if (arr.length==0){
            return -1;
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]) {
                min=arr[i];
            }
        }
        return min;
    }
    static int minRange(int[] arr,int start,int end) {
        if(start>end){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int min=arr[start];
        for (int i = start; i <end ; i++) {
            if (min>arr[i]) {
                min=arr[i];
            }
        }
        return min;
    }

    static int maxRange(int[] arr,int start,int end){
        if(start>end){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max=arr[start];
        for (int i = start+1; i <= end; i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
    static void reverseArr(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static int doesContains(int[] arr,int x){
        boolean flag = false;
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                flag= true;
                pos=i;
                break;
            }
            else {
                flag= false;
            }
        }
        if (flag) {
            System.out.print("found at ");
            return pos;
        }
        else return -1;
    }
    public static void main(String[] args) {
        //swapping an element of an array
        int[] arr1={1,2,3,4,5,6,7};
        swap(arr1,1,3);
        printArr(arr1);
        //Max item
        int[] arr2={13,2,3,4,5,6,7,125,8,56};
        System.out.println("Max :"+max(arr2));
        System.out.println("Min :"+min(arr2));
        System.out.println("Max in range : "+maxRange(arr2,3,6));
        System.out.println("Min in range : "+minRange(arr2,3,6));
        //reverse array
        int[] arr3={1,2,3,4,5,6,7};
        reverseArr(arr3);
        System.out.println("Array rev : ");
        printArr(arr3);
        //whether contains an element
        System.out.println(doesContains(arr2,7));
    }
}
