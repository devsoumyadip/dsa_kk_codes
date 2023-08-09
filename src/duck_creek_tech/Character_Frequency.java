package duck_creek_tech;

import java.util.HashMap;

//7. Write code to Calculate frequency of characters in a string
public class Character_Frequency {
    public static void findFrequency(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        findFrequency("programming");
    }
}
