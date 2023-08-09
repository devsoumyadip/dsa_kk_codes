package duck_creek_tech;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if (s.length()==0){
            return false;
        }
        String ans="";
        for (int i = s.length()-1; i >=0 ; i--) {
            ans+=s.charAt(i);
        }
        if (ans.equals(s)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ronaldo"));
    }
}
