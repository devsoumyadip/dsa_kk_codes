package recursions;

import java.util.ArrayList;

public class AsciiValue {
    public static void main(String[] args) {
//        asciiSeq("","ab");
        System.out.println(asciiSubSeqRet("","ab"));
    }
    public static void asciiSeq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        asciiSeq(p,up.substring(1));
        asciiSeq(p+ch,up.substring(1));
        asciiSeq(p+(ch+0),up.substring(1));
    }
    public static ArrayList<String> asciiSubSeqRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first= asciiSubSeqRet(p,up.substring(1));
        ArrayList<String> second= asciiSubSeqRet(p+ch,up.substring(1));
        ArrayList<String> third= asciiSubSeqRet(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
