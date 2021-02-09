// https://leetcode.com/problems/number-of-lines-to-write-string/ 

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] ret = new int[2];
        if (S == null || S.equals("") || widths.length != 26) {
            ret[0] = 0;
            ret[1] = 0;
            return ret;
        }
        int lines = 1;
        int lastLineUnits = 0;
        char[] characters = S.toCharArray();
        for (char c : characters) {
            int currentUnits = widths[c - 'a'];
            if (lastLineUnits + currentUnits > 100) {
                lines++;
                lastLineUnits = currentUnits;
            } else {
                lastLineUnits += currentUnits;
            }
        }
        ret[0] = lines;
        ret[1] = lastLineUnits;
        return ret;                
    }
}