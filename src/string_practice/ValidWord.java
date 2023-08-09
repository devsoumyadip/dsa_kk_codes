package string_practice;

public class ValidWord {
    /*
    3136. Valid Word
    A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

Notes:

'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.
     */
    public boolean isValid(String word) {
        //length check
        if(word.length()<3){
            return false;
        }
        int vc=0;
        int cc=0;

        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if ("aeiouAEIOU".indexOf(c) != -1){
                vc++;
            }
            else if((c>='a' && c <= 'z' || c >= 'A' && c <= 'Z') && "AEIOUaeiou".indexOf(c)==-1){
                cc++;
            }
        }
        return vc > 0 && cc > 0;
    }

    public static void main(String[] args) {
        String word="234Adas";
        ValidWord vw=new ValidWord();
        System.out.println(vw.isValid(word));
    }
}
