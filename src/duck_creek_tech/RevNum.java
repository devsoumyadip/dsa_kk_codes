package duck_creek_tech;

import java.util.Scanner;

public class RevNum {
//    function to revere a number
    public static int revNum(int num){
        String ans="";
        String numS=String.valueOf(num);
        if (numS.length()>1){
            for (int i = numS.length()-1; i >=0 ; i--) {
                ans+=numS.charAt(i);
            }
            return Integer.valueOf(ans);
        }
        return num;
        }

    public static void main(String[] args) {
        System.out.println("Enter a number to reverse it : ");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The reversed number is : "+revNum(num));
    }
}
