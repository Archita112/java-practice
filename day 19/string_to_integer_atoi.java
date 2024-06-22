//samjh ke chaapa hai

public class string_to_integer_atoi {
    public static int atoi(String s){
        int index = 0, sign = 1; // Step 1: Initialize variables
        
        if (s.length() == 0) return 0; // Step 2: Handle empty string

        // Step 3: Skip leading whitespace
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // Step 4: Handle optional sign
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        int result = 0; // Initialize result

        // Step 5: Convert characters to integer
        while (index < s.length()) {
            if (!Character.isDigit(s.charAt(index))) break;

            char current = s.charAt(index++);
            int previous = result;

            result *= 10; // Step 6: Update result

            // Step 7: Handle overflow
            if (result / 10 != previous) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result += (current - '0');

            // Another overflow check (shouldn't be necessary but added for safety)
            if (result < 0) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }

        return result * sign; // Step 8: Return final result
    }
    public static void main(String[] args) {
        String s = "42";
        System.out.println(atoi(s));
    }
}
