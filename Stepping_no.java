import java.util.*;

public class Stepping_no {
    public static void main(String[] args) {
        // 123, 545,654
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        for (int i = n; i <= m; i++) {
            if (isStepping(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static Boolean isStepping(int n) {
        while (n > 0) {
            int d1 = n % 10;
            n = n / 10;
            if (n > 0) {
                int d2 = n % 10;
                if (Math.abs(d1 - d2) != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
