import java.util.ArrayList;

public class StrAndStrBldr {
    public static void main(String[] args) {
        float a = 459.15752f;
        System.out.printf("Formatted number is %.2f\n",a);
        System.out.printf("Value of PI is %.2f\n",Math.PI);
        System.out.printf("Hello my name is %s, and i am %s\n","soumyadip","HIGH");

        /*
        Format specifiers for java
        %c ->character
        %d -> decimal num(base 10)
        %e -> exponential
        %f -> float
        %i -> Integer
        %o -> octal number
        %s -> string
        %u -> unsigned decimal(integer - base 10)
        %x -> hexadecimal(base 16)
        %t -> date/time
         */

        /*
        operators
         */
        System.out.println('a'+'b');  //converting the char to its int value and thenits adding up
        System.out.println("a"+"b");  //concatenating two strings
        System.out.println((char)('a'+3)); //converting a+3 to char

        System.out.println("a"+5); //when an int is converted to Integer , that will call toString()
        System.out.println("jana"+new ArrayList<>());
        //System.out.println(new Integer(25)+new ArrayList<>());    =====>>throw error
        //+ operator in java is only defined for primitives and when any one of the values is string
        //if we pass at least one empty string it will work fine
        System.out.println(new Integer(25)+""+new ArrayList<>());
        //operator overloading is not supported in java, but its supported in C++.

    }
}
