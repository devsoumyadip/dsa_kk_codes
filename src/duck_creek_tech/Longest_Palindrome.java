package duck_creek_tech;

public class Longest_Palindrome {
    public static boolean isPalindrome(String s){
        String ans="";
        for (int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        if (ans.equals(s)){
            return true;
        }
        return false;
    }
    public static int findLongestPalindrome(int[] arr){
        int max=0;
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(String.valueOf(arr[i]))){
                if (String.valueOf(arr[i]).length()>max){
                    max=String.valueOf(arr[i]).length();
                    ans=arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={121,123,154,1551};
        System.out.println(findLongestPalindrome(arr));
    }
}
