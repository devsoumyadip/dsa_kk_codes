import java.util.Random;

public class MaxNumOfPairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int pair=0;
        int i=0;
        while(i<words.length){
           String s=rev(words[i]);
            for (int j = 0; j < words.length; j++) {
                if (s.equals(words[j])){
                    pair++;
                }
            }
            i++;

        }
        return pair;
    }
    public static String rev(String s){
        String news="";
        for(int i=1;i>=0;i--){
            news+=s.charAt(i);
        }
        return news;
    }
    public boolean isAnagram(String s, String t) {
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String[] words = {"cd","ac","dc","ca","zz"};
//        System.out.println(rev(words[0]));
//        System.out.println(maximumNumberOfStringPairs(words));

        Random random = new Random();
//        String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L) 	;
//        String cardnumber2 = "" + Math.abs((random.nextLong() % 800L)+3120000L);
//        String pin = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
//        System.out.println(cardnumber);
//        System.out.println("2:"+cardnumber2);
//        System.out.println(pin);
//        System.out.println("Card Number: "+cardnumber.substring(0,4)+"XXXXXXXX"+cardnumber.substring(12));

    }
}
