import java.util.*;

public class World_count_String {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] words = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }
        System.out.println(map);
    }
}
