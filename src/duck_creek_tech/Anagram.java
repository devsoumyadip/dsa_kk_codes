package duck_creek_tech;

import java.util.Arrays;

public class Anagram {
    public static boolean isPalindrome(String s){
        String srev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            srev+=s.charAt(i);
        }
      if (s.equals(srev)){
          return true;
      }
      return false;
    }
    public static boolean isAna(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
//        System.out.println(isAna("listens","silent"));
        System.out.println(isPalindrome("eye"));
    }
}
