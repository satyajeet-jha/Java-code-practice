import java.util.*;

public class Rotate_array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.println("Enter the value of k: ");
        k = sc.nextInt();
        sc.close();
        int[] arr1 = new int[n];
        for (int i = k; i < n; i++) {
            arr1[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr1[n - k + i] = arr[i];
        }
        System.out.println("The array after rotating k elements to the right is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
