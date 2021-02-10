// https://leetcode.com/problems/repeated-substring-pattern/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, 2 * s.length() - 1).contains(s);
    }
}