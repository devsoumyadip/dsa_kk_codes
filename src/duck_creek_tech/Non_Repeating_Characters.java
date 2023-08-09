package duck_creek_tech;

import java.util.HashMap;
import java.util.Map;

//Find non-repeating characters in a string
public class Non_Repeating_Characters {
    public static void findNonRepeatingChar(String str){
        HashMap<Character,Integer> frequency=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (frequency.containsKey(str.charAt(i))){
                frequency.put(str.charAt(i),frequency.get(str.charAt(i))+1);
            }
            else {
                frequency.put(str.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> e : frequency.entrySet()) {
            if (e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
    }
    public static void main(String[] args) {
        findNonRepeatingChar("balloon");
    }
}
