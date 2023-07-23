import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrList1=new ArrayList<>();

        //adding elements to array list
        arrList1.add(69);
        arrList1.add(65);
        arrList1.add(64);
        arrList1.add(63);
        arrList1.add(62);
        arrList1.add(61);
        System.out.println(arrList1);
        //if a element contains in array list
        System.out.println(arrList1.contains(7));
        //adding an element in specific index of array list
        arrList1.set(1,9);
        System.out.println(arrList1);
        //removing elements from array list
        arrList1.remove(2);
        System.out.println(arrList1);
        //taking input
        ArrayList<Integer> arrayList2=new ArrayList<>();
        System.out.println("Enter the size of the array : ");
        int len=sc.nextInt();
        System.out.println("Enter numbers :");
        for (int i = 0; i < len; i++) {
            arrayList2.add(sc.nextInt());
        }
        System.out.println(arrayList2);

    }
}
