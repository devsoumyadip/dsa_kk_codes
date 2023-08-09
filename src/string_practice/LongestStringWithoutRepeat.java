package string_practice;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Handler;

public class LongestStringWithoutRepeat {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;
        Set<Character> charSet=new HashSet<>();
        int left =0;

        for (int i = 0; i < n; i++) {
            if (!charSet.contains(s.charAt(i))){
                charSet.add(s.charAt(i));
                maxLen=Math.max(maxLen,i-left+1);
            }
            else {
                while (charSet.contains(s.charAt(i))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(i));
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        String p="bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(p));
    }
}
