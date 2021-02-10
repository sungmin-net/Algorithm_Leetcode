// https://leetcode.com/problems/add-binary/

class Solution {
    public String addBinary(String a, String b) {

        if (a == null && b == null) {
            return "";
        }
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }
        StringBuffer buf = new StringBuffer();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        boolean carry = false;
        int cur = 0;
        while (aIdx >= 0 || bIdx >= 0 || carry) {
            if (aIdx >= 0 && aChars[aIdx] == '1') {
                cur++;
            }
            if (bIdx >= 0 && bChars[bIdx] == '1') {
                cur++;
            }
            if (carry) {
                cur++;
                carry = false;
            }
            if (cur > 1) {
                cur -= 2;
                carry = true;
            }
            buf.insert(0, cur);
            cur = 0;
            aIdx--;
            bIdx--;
        }

        return buf.toString();
    }        
}