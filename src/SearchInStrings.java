public class SearchInStrings {
    public static void main(String[] args) {
        String name="riya";
        char target='a';
        System.out.println(linear_str_search(name,target));
        System.out.println(linear_str_search2(name,target));
    }
    static boolean linear_str_search(String str,char target) {
      if (str.length()==0) {
          return false;
      }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    static int linear_str_search2(String str,char target) {
      if (str.length()==0) {
          return -1;
      }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
