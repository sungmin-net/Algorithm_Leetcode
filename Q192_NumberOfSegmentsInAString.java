// https://leetcode.com/problems/number-of-segments-in-a-string/

class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean isPrevChar = false;
        for (char c : s.toCharArray()) {
            if (c != ' ') { // cur char is char
                if (!isPrevChar) {
                    count++;
                    isPrevChar = true;
                }
            } else {        // cur char is space
                isPrevChar = false;
            }
        }
        return count;
    }
}