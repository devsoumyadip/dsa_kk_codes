package duck_creek_tech.hackerrank_problems;

public class Caeser_Cipher {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder rotatedStringBuilder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            char base;
            if (Character.isLetter(ch)) {
                if(Character.isLowerCase(ch)){
                    base='a';
                }
                else{
                    base='A';
                }
                char rotatedChar = (char) ((ch - base + k) % 26 + base);
                rotatedStringBuilder.append(rotatedChar);
            } else {
                rotatedStringBuilder.append(ch); // Keep special characters unchanged
            }
        }

        return rotatedStringBuilder.toString();
    }

    public static void main(String[] args) {
        String s="middle-Outz";
        String s2="There's-a-starman-waiting-in-the-sky";
        System.out.println(caesarCipher(s,2));
        System.out.println(caesarCipher(s2,3));
    }
}
