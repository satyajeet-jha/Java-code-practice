import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements for " + n + " array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b = (n / 2) + 1;
        sc.close();
        int result = solution(a, b);
        System.out.println("The ans is " + result);
    }

    static int solution(int[] a, int b) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        for (int j = 0; j < map.size(); j++) {
            if (map.get(a[j]) >= b) {
                return a[j];
            }
        }
        return -1;
    }
}
