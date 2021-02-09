// https://leetcode.com/problems/reverse-only-letters/

class Solution {
    public String reverseOnlyLetters(String S) {
        int start = 0;
        int end = S.length() - 1;
        char[] chars = S.toCharArray();
        while (start < end) {
            while (!Character.isLetter(chars[start]) && start < S.length() - 1) {
                start++;
            }
            while (!Character.isLetter(chars[end]) && end > 0) {
                end--;
            }
            if (start < end) {
                chars[start] ^= chars[end];
                chars[end] ^= chars[start];
                chars[start] ^= chars[end];
            }
            start++;
            end--;
        }

        return String.copyValueOf(chars);
    }
}