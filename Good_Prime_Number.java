import java.util.*;

// A prime number is a number which is divisible by one and itself. Also a number is called a good  prime number if the sum of its digits is a prime number. For example a number 23 is a good prime number because the sum of 2 and 3 ( 2+3=5) is 5 which is a prime number. You are given an integer K. Your task is to find the kth good prime number that is greater than a provided number N.
// For example , 232 is a good prime number since the sum of all digits is 7 which is a prime number whereas 235 is not a good prime number.

public class Good_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the nth number: ");
        int k = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = n + 1;; i++) {
            if (isPrime(i)) {
                int sum = 0;
                int temp = i;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (isPrime(sum)) {
                    count++;
                }
            }
            if (count == k) {
                System.out.println(i);
                break;
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
