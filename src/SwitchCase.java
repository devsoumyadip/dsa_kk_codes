import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Enter a weekday : ");
        String day =sc.next();

        switch (day) {
            case ("sunday") -> System.out.println(day + " is the first day of the week.");
            case ("monday") -> System.out.println("Second day of the week.");
            case ("tuesday") -> System.out.println("Third day of the week.");
            case ("wednesday") -> System.out.println("Fourth day of the week.");
            case ("thursday") -> System.out.println("Fifth day of the week.");
            case ("friday") -> System.out.println("Sixth day of the week.");
            case ("saturday") -> System.out.println("Seventh day of the week.");
            default -> System.out.println("Enter a valid day.");
        }

        System.out.println("Enter an alphabet : ");
        String letter =sc.next();
        switch(letter) {
            case("a") -> System.out.println("A for apple");
            case("b") -> System.out.println("B for baal");
            case("c") -> System.out.println("C for cat");
            default -> System.out.println("enter a valid alphabet");
        }

        System.out.println("Enter a number between 1 to 7 : ");
        int dayNum=sc.nextInt();
        switch (dayNum) {
            case(1)-> System.out.println("sunday");
            case(2)-> System.out.println("monday");
            case(3)-> System.out.println("tuesday");
            case(4)-> System.out.println("wednesday");
            case(5)-> System.out.println("thursday");
            case(6)-> System.out.println("friday");
            case(7)-> System.out.println("saturday");
            default-> System.out.println("Enter a number between 1 to 7.");
        }
         */

        //nested switch case
        System.out.println("Enter a number between 1 to 3 :");
        int num=sc.nextInt();
        switch (num) {
            case (1):
                System.out.println("user entered 1.");
                break;
            case (2):
                System.out.println("Enter a multiple of 2");
                int mulOfTwo=sc.nextInt();
            switch (mulOfTwo) {
                case (0)-> System.out.println("0x2");
                case (2)-> System.out.println("1x2");
                case (4)-> System.out.println("2x2");
                default -> System.out.println("Enter correct number.");
            }
            break;
            case (3):
                System.out.println("user entered 3.");
                break;
            default:
                System.out.println("Enter a num between 1 to 3");
        }
    }
}
