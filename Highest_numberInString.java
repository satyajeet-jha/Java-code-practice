
public class Highest_numberInString {
    public static void main(String[] args) {
        String s = "I have 30 bags of rice of 500gm";
        int max = 0;
        int num = 0;
        boolean inNumber = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // Accumulate the digit
                inNumber = true;
            } else if (inNumber) {
                max = Math.max(max, num);
                num = 0; // Reset num for the next potential number
                inNumber = false;
            }
        }

        // Final check in case the string ends with a number
        if (inNumber) {
            max = Math.max(max, num);
        }

        System.out.println(max);
    }
}
