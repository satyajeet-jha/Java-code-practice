import java.util.*;

class Character_Count_String {
    public static void main(String[] args) {

        String s = "Hello world how world are hello";
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            } else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }
        System.out.println(map);
    }
}