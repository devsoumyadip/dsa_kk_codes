package string_practice;
/*
3042. Count Prefix and Suffix Pairs I
Solved
Easy
Topics
Companies
Hint
You are given a 0-indexed string array words.

Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:

isPrefixAndSuffix(str1, str2) returns true if str1 is both a
prefix
 and a
suffix
 of str2, and false otherwise.
For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix, but isPrefixAndSuffix("abc", "abcd") is false.

Return an integer denoting the number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i], words[j]) is true.



Example 1:

Input: words = ["a","aba","ababa","aa"]
Output: 4
Explanation: In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
Therefore, the answer is 4.
 */

public class Count_Prefix_And_Suffix {
    public int countPrefixSuffixPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length-1;i++){

            for(int j=i+1;j<words.length;j++){

                if(words[j].length()>=words[i].length() && isPrefixAndSuffix(words[i],words[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static boolean isPrefixAndSuffix(String str1,String str2){
        if(str2.endsWith(str1) && str2.startsWith(str1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Count_Prefix_And_Suffix c=new Count_Prefix_And_Suffix();
        String[] w={"a","aba","ababa","aa"};
        System.out.println(c.countPrefixSuffixPairs(w));
    }
}
