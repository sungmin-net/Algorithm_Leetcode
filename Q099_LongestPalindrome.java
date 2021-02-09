// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int ret = 0;
        boolean hasOdd = false;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 0) {
                ret += map.get(c);  // add even count itself
            } else {
                ret += map.get(c) - 1;  // add odd count - 1
                hasOdd = true;
            }
        }
        return hasOdd ? ret + 1 : ret; // consider the longest odd count as the center
    }
}