public class Strong_Number {
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += fact(rem);
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }

    }

    static int fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return fact(a - 1) * a;
        }
    }
}
