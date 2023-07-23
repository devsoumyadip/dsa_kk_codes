import java.util.*;

public class Arrays {
    //using array as a parameter in a method
    public static void changeNums(int[] arr){
        arr[0]=9;
        arr[1]=07;
        arr[2]=2001;
        System.out.println(java.util.Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //data_type[] variable_name(reference variable)=new data_type[size]

        //storing 5 integers in an array(array of primitives)
        int num[]=new int[5];
        num[0]=56;
        num[1]=46;
        num[2]=96;
        num[3]=86;
        num[4]=66;

        int[] nums2={56,96,41,33,89};

        //printing an array using for loop
        for (int i = 0; i < num.length ; i++) {
           System.out.println(num[i]);
        }

        //printing an array using toString method
        System.out.println(java.util.Arrays.toString(nums2));

        int[] ros;  //declaration of the array. ros is getting defined in stack
        ros=new int[5]; // initialization : actually the object here is being created in the memory(heap)

        //Array of object
        String[] names=new String[5];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < names.length; i++) {
            names[i]=sc.next();
        }
        System.out.println(java.util.Arrays.toString(names));

        int[] arr={07,07,2001};
        changeNums(arr);
    }
}
