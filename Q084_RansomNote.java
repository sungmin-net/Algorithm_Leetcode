// https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.isEmpty()) {
            return true;
        }
        if (magazine == null || magazine.isEmpty() || magazine.length() < ransomNote.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0 ; i < magazine.length() ; i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0 ; i < ransomNote.length() ; i++) {
            char c = ransomNote.charAt(i);
            if (!map.containsKey(c)){
                return false;
            }
            map.replace(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}