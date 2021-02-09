// https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int pow = 0;
        int sum = 0;
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            sum += (s.charAt(i) - 'A' + 1) * Math.pow(26, pow);
            pow++;
        }
        return sum;                
    }
}