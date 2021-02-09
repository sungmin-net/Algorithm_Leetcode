// https://leetcode.com/problems/student-attendance-record-i/

class Solution {
    public boolean checkRecord(String s) {
        boolean hasA = false;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == 'A') {
                if (hasA) {
                    return false;
                } else {
                    hasA = true;
                }
            }
            if (s.charAt(i) == 'L') {
                if (i < s.length() - 2 && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                    return false;
                }
            }
        }
        return true;                
    }
}