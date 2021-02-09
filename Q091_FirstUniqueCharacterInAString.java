// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }            
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;                
    }
}