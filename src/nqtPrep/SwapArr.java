package nqtPrep;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapArr {
    //a func that will swap array elements from middle
    // for ex- input : [55,12,65,75,88,89,45,35]
    //         output : [88,89,45,35,55,12,65,75]
    //if the array is of even number elements middle element will remain in the middle
    public static void swapArr(ArrayList<Integer> list){
        int s= list.size();
        int mod=s%2;
        int el=s/2;

        for (int i = 0; i < el; i++) {
            if (mod==1){
                Collections.swap(list,i,i+1+el);
            }
            else if (mod==0){
                Collections.swap(list,i,i+el);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,55);
        list.add(1,12);
        list.add(2,65);
        list.add(3,75);
        list.add(4,88);
        list.add(5,89);
        list.add(6,35);
        list.add(7,45);
        list.add(8,22);
        System.out.println(list);
        swapArr(list);
        System.out.println(list);
    }
}
