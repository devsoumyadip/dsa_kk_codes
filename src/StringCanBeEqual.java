public class StringCanBeEqual {
    public static boolean canBeEqual(String s1, String s2) {
        int j=0;
        char ch[]=s1.toCharArray();
        while(j<s1.length()){
            for(int i=0;i<s1.length();i++){
                if(i-j==2){
                    swap(ch,ch[i],ch[j]);
                }
            }
            j++;
        }

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }

    private static void swap(char[] ch,char c1, char c2) {
        char temp=c1;
        c1=c2;
        c2=temp;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dacb";
//        System.out.println(canBeEqual(s1,s2));

    }
}
