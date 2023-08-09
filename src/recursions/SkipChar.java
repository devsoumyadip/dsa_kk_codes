package recursions;

public class SkipChar {
    public static void main(String[] args) {
        skip("","bokachoda");
        System.out.println(skip2("abbadsaADc"));

    }
    public static void skip(String ps,String ups){  // passing an extra argument in functiom
        if(ups.isEmpty()){
            System.out.println(ps);
            return;
        }
        char ch=ups.charAt(0);
        if (ch=='a' || ch=='A'){
            skip(ps, ups.substring(1));
        }
        else {
            skip(ps+ch,ups.substring(1));
        }
    }
    public static String skip2(String ups){  // without passing an extra argument in functiom
        if (ups.isEmpty()){
            return " ";
        }
        char ch=ups.charAt(0);
        if (ch=='a' || ch=='A'){
            return skip2(ups.substring(1));
        }
        return ch+skip2(ups.substring(1));
    }
}
