// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[ len - 1 ]++;
        for (int i = digits.length - 1 ; i >= 0 ; i--) {
            if (digits[i] == 10) {
                if (i != 0) {
                    digits[i] = 0;
                    digits[i-1]++;
                } else {
                    digits[i] = 0;
                    int[] temp = new int[len + 1];
                    temp[0] = 1;
                    System.arraycopy(digits, 0, temp, 1, len);
                    digits = temp;
                }
            }
        }
        return digits;
    }
}