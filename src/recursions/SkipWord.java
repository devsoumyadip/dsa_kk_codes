package recursions;

public class SkipWord {
    public static void main(String[] args) {
        System.out.println(skipWord("thisisanapplepie"));
        System.out.println(skipAppnotApple("thisisanapplepienotanapp"));
    }
    public static String skipWord(String up){   // skipping the word 'apple'
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipWord(up.substring(5));
        }
        else{
            return up.charAt(0)+skipWord(up.substring(1));
        }
    }

    public static String skipAppnotApple(String ups){   // skipping the word 'app' but not 'apple'
        if (ups.isEmpty()){
            return "";
        }
        if (ups.startsWith("app") && !ups.startsWith("apple")){
            return skipAppnotApple(ups.substring(3));
        }
        else{
            return ups.charAt(0)+skipAppnotApple(ups.substring(1));
        }
    }
}
