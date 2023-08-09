package string_practice;
/*
3083. Existence of a Substring in a String and Its Reverse
Easy
Topics
Companies
Hint
Given a string s, find any
substring
 of length 2 which is also present in the reverse of s.

Return true if such a substring exists, and false otherwise.



Example 1:

Input: s = "leetcode"

Output: true

Explanation: Substring "ee" is of length 2 which is also present in reverse(s) == "edocteel".


 */

public class ExistanceOfASubstring {
    public boolean isSubstringPresent(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
            for(int j=0;j<rev.length()-1;j++){
                if(s.contains(rev.substring(j,j+2))){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="leetcode";
        ExistanceOfASubstring ex=new ExistanceOfASubstring();
        System.out.println(ex.isSubstringPresent(s));
    }
}
