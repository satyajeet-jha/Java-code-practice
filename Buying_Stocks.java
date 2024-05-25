import java.util.*;

public class Buying_Stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements for " + n + " array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int max_loss = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] - a[j] > max_loss) {
                    max_loss = a[i] - a[j];
                }
            }
        }
        System.out.println(max_loss);
    }
}
