package duck_creek_tech;

//13. Write a code to replace a substring in a string.
public class Replace_Substring {
    public static String replace(String s,String o,String n){
        String newS="";
        if (s.contains(o)){
            newS=s.replace(o,n);
        }
        return newS;
    }
    public static void main(String[] args) {
        System.out.println(replace("ronaldo","do","good"));
    }
}
