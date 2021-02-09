// https://leetcode.com/problems/rotated-digits/

class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1 ; i <= N ; i++) {
            if (isRotatble(i)) {
                count++;
//                System.out.println(i);
            }
        }
        return count;
    }
    private static boolean isRotatble(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        boolean isValid = false;
        for (char c : chars) {
            if (c == '2' || c == '5' || c == '6' || c == '9') {
                isValid = true;
            }
            if (c == '3' || c == '4' || c == '7') {
                return false;
            }
        }
        return isValid;
    }    
}