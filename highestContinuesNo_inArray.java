class highestContinuesNo_inArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25, 26, 27, 28,
                29, 30, 31, 32, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56, 57,
                58, 59, 60, 61, 62, 63, 64, 65, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 78, 79, 80, 81, 82, 83, 84, 85,
                86, 87, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 100 };
        int n = arr.length;
        System.out.println("The highest continuous number in the array is: " + highestContinuesNo(arr, n));
    }

    static int highestContinuesNo(int[] arr, int n) {
        int max = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }

}