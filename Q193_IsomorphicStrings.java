// https://leetcode.com/problems/isomorphic-strings/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char curS = '\0';
        char curT = '\0';
        boolean isInMap = false;
        for (int i = 0 ; i < s.length() ; i++) {
            curS = s.charAt(i);
            curT = t.charAt(i);
            isInMap = map.containsKey(curS);
            if (!isInMap) {
                if (map.containsValue(curT)) {
                    return false;
                }
                map.put(curS, curT);
            } else {
                if (map.get(curS) != curT) {
                    return false;
                }
            }
        }
        return true;
    }
}