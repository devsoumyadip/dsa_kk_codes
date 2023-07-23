import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter elements in the array : ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the number by which you want to divide : ");
        int div=sc.nextInt();
        System.out.println("Enter the array index : ");
        int ind=sc.nextInt();
        try {
            System.out.printf("%d / %d = %d\n",arr[ind],div,arr[ind]/div);
            System.out.println("Nested Try & Catch.");
        try {
            System.out.printf("%dth element of the array is : ",ind);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error.");
            System.out.println(e);
        }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
