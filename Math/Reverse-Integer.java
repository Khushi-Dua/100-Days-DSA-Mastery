class Solution {  
    public int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;

            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
       }
}
