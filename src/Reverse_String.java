public class Reverse_String {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseStr(s);
    }
    static void reverseStr(char[] s){
        int start=0;
        int end=s.length-1;
        for (int i = 0; i <= end/2 && start<=end; i++) {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
