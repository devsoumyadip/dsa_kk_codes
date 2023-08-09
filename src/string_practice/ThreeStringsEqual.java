package string_practice;
/*
2937. Make Three Strings Equal
Solved
Easy
Topics
Companies
Hint
You are given three strings: s1, s2, and s3. In one operation you can choose one of these strings and delete its rightmost character. Note that you cannot completely empty a string.

Return the minimum number of operations required to make the strings equal. If it is impossible to make them equal, return -1.



Example 1:

Input: s1 = "abc", s2 = "abb", s3 = "ab"

Output: 2

Explanation: Deleting the rightmost character from both s1 and s2 will result in three equal strings.
 */

public class ThreeStringsEqual {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int index=0;
        for(int i=0;i<Math.min(s1.length(),Math.min(s2.length(),s3.length()));i++){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
                index++;
                continue;
            }
            else{
                break;
            }
        }
        if(index==0){
            return -1;
        }
        return s1.length()-index+s2.length()-index+s3.length()-index;
    }

    public static void main(String[] args) {
        String s1="abc";
        String s2="abb";
        String s3="ab";
        ThreeStringsEqual ts=new ThreeStringsEqual();
        System.out.println(ts.findMinimumOperations(s1,s2,s3));
    }
}
