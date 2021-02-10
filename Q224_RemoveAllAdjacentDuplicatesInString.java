// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String S) {
        StringBuffer buf = new StringBuffer();
        for (char c : S.toCharArray()) {
            int len = buf.length();
            if (len > 0 && c == buf.charAt(len - 1)) {
                buf.deleteCharAt(len - 1);
            } else {
                buf.append(c);
            }
        }
        return buf.toString();
    }
}