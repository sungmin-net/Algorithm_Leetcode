// https://leetcode.com/problems/string-compression/

class Solution {
    public int compress(char[] chars) {
        // best
        int len = chars.length;
        if (len < 2) {
            return len;
        }
        int writeIdx = 0;
        int start = 0;
        int end = 0;
        int count = 0;
        while (end < len) {
            char c = chars[ start ];
            while (end < len && chars[end] == c) {
                end++;
                count++;
            }
            start = end;
            chars[ writeIdx++ ] = c;
            if (count != 1) {
                if (count > 1 && count < 10) {
                    chars[ writeIdx++ ] = (char)(count + '0');
                } else {
                    for (char i : ("" + count).toCharArray()) {
                        chars[writeIdx++] = i;
                    }
                }
            }
            count = 0;
        }
        return writeIdx;                
    }
}