package string_practice;
/*
3120. Count the Number of Special Characters I

You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.



Example 1:

Input: word = "aaAbcBC"

Output: 3

Explanation:

The special characters in word are 'a', 'b', and 'c'.
 */

import java.util.HashSet;
import java.util.Set;

public class SpecialCharacters {
    public int numberOfSpecialChars(String word) {
        Set<Character> s = new HashSet<>();
        Set<Character> c = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                s.add(ch);
            } else {
                c.add(ch);
            }
        }
        int ans = 0;
        for(char ch : s){
            if(c.contains(Character.toUpperCase(ch))){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String word="aaAbcBC";
        SpecialCharacters sp=new SpecialCharacters();
        System.out.println(sp.numberOfSpecialChars(word));
    }

}
