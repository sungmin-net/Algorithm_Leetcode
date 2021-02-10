// https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int ret = 0;
        int bal = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == 'R') {
                bal++;
            } else {
                bal--;
            }
            if (bal == 0) {
                ret++;
            }
        }
        return ret;                
    }
}