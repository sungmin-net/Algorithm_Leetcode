// https://leetcode.com/problems/license-key-formatting/

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuffer buf = new StringBuffer();
        char[] chars = S.toCharArray();
        int count = 0;
        for (int i = S.length() - 1 ; i >= 0 ; i--) {
            if (chars[i] == '-') {
                continue;
            }
            if (count % K == 0 && count > 0) {
                buf.insert(0, '-');
            }
            buf.insert(0, chars[i]);
            count++;
        }

        return buf.toString().toUpperCase();
    }
}