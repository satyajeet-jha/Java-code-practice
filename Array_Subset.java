import java.util.HashMap;
import java.util.Map;

public class Array_Subset {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 5, 6, 7, 2, 3, 4, 5 };
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], 1);
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], 1);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (map2.containsKey(arr1[i])) {
                System.out.println("Subset");
                continue;
            } else {
                System.out.println("Not a subset");
                return;
            }
        }
    }
}
