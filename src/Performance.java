import java.util.Arrays;

public class Performance {

    static boolean ifPalindrome(String word){
        int start=0;
        int end=word.length()-1;
        word=word.toLowerCase();
        while(end>start){
            if (word.charAt(start)==word.charAt(end)){
                start++;
                end--;
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            series =series+ch;
        }
        System.out.println(series);   //here its copying the previous str and adding the new value to it(immutability)

        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);  //here no coping is happened,just adding the chars at the end of the existing string
        System.out.println(builder.indexOf("r"));
        builder.deleteCharAt(0);
        System.out.println(builder);

        String name="Riya kumar is not well";
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.split(" ")));  //split whenever there is a space,and it will return an array

        System.out.println(ifPalindrome("null"));
    }
}
