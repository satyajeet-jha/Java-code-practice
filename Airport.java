import java.util.*;

public class Airport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of luggage:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the weights for " + n + " luggage:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the maximum weight:");
        int m = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= m) {
                sum += 1;
            } else {
                sum += 2;
            }
        }
        System.out.println(sum);
    }
}
