import java.util.Scanner;

public class More_nested_try_catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,5,6,7};
        while (true) {
            try{
                System.out.println("Enter array index : ");
                int n=sc.nextInt();
                System.out.println(arr[n]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Uh oh!!!!!!!!");
                break;
            }
        }
    }
}
