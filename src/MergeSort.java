import java.util.Arrays;
public class MergeSort {
    // WARNING :: BORING THEORY

    //the basic idea of merge sort is : divide an array into halves,then sort the two divided arrays
    //then merge the arrays
    //to understand this with an example, let an array arr=[2,1,6,9,4,5]
    // to divide arr into half take the middle element as mid=arr.length/2
    //so we have two arrays from the original array. first=arr[0] to arr[mid]  (2,1,6)
    //                                               second=arr[mid+1] to arr[arr.length-1]   (9,4,5)
    // now how to sort the two arrays and  how to merge
    /*
    sort :
    * call the func. in recursive way so that it can keep doing half the array
    *we are giving a copy of the array to the func.,the func. calls itself again to re-assign the work


  Arrays.copyOfRange(param:arr[],int beginIndex,int endIndex)----->copy of the array within the specified
   range and lets it store into a variable
    int[] copy=Arrays.copyOfIndex(arr,0,3);


    * when the length of the array becomes 1, simply return the array containing one element
    **Return the array not the element
    in this way the dividing part will be done

               2,1,6,9,4,5
               /        \
              /          \
       2,1,6             9,4,5----> copy the array within specified range,then pass it in the recursive call
         /\                 /\
      2,1  6              9,4  5 -----> length becomes 1
       /\   |              /\   |
      2  1   6            9  4  5 ------>array with 1 element returned
      |  |                |  |
      2  1                9  4 -------> similarly returned other arrays

    Merge:
    lets understand merge with an example
    we have two sorted arrays
        first=[1,2,6,10,23]
        second=[4,5,9]

        we need three pointers and a new array of length (1st+2nd arr)
        mix[]=first.length+second.length
        i=0
        j=0
        k=0
        conditions:
        the loop will run while (i<first.length && j<second.length)
            if first[i]<second[j]  ------>mix[k]=first[i],i++
                            else   ------>mix[k]=second[j],j++
                       then whenever add a element in mix, do (k++),

       it is also possible that one of the array is not finished,i.e. bigger in size(like here)
       so for this case the condition will be :
        if(i<first.length)   ------->mix[k]=first[i],k++,i++
        if(j<second.length)   ------->mix[k]=second[j],k++,j++

        then lastly return mix[]

     */
    public static void main(String[] args) {
        int[] arr={2,1,6,10,23,9,4,5};
        int[] arr2={};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){

        if(arr.length<=1){
            return arr;
        }
        int mid= arr.length/2;
        int[] first= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] second=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }
    public static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;

        while (i< first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

}
