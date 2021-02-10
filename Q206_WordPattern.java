// https://leetcode.com/problems/word-pattern/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] words = str.split(" ");
        for (int i = 0 ; i < pattern.length() && i < words.length; i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                if (set.contains(words[i])) {
                    return false;
                }
                map.put(c, words[i]);
                set.add(words[i]);
            } else {
                if (!map.get(c).equals(words[i])) {
                    return false;
                }
            }
        }
        StringBuffer buf = new StringBuffer();
        for (int i = 0 ; i < pattern.length() ; i++) {
            char c = pattern.charAt(i);
            buf.append(map.get(c));
            if (i != pattern.length() - 1) {
                buf.append(" ");
            }
        }

        return buf.toString().equals(str);
    }
}