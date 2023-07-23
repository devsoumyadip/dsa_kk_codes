import java.util.*;
public class TryAndCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=4;
        int b=0;
        try {
            System.out.println("a / b = "+a/b);
        }
        catch (Exception e){
            System.out.println("Error : "+e);
        }

        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter elements in the array : ");
        int[] arr=new int[n];
        for (int i = 0; i < 3; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array : ");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the array index : ");
        int ind=sc.nextInt();

        System.out.println("Enter the number by which you want to divide : ");
        int div=sc.nextInt();

        try {
            System.out.printf("%d / %d = %d\n",arr[ind],div,arr[ind]/div);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException. "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException. "+e);
        }
        catch (Exception e){
            System.out.println("Exception. "+e);
        }
    }
}
