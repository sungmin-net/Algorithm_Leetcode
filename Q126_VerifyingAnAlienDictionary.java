// https://leetcode.com/problems/verifying-an-alien-dictionary/

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> MAP = new HashMap<Character, Integer>();
        for (int i = 0 ; i < order.length() ; i++) {
            MAP.put(order.charAt(i), i);
        }
        for (int i = 0 ; i < words.length - 1 ; i++) {
            boolean isOrdered = false;
            for (int j = 0 ; j < words[i].length() && j < words[i + 1].length(); j++) {
                if (MAP.get(words[i].charAt(j)) == MAP.get(words[i + 1].charAt(j))) {
                    continue;
                } else if (MAP.get(words[i].charAt(j)) < MAP.get(words[i + 1].charAt(j))) {
                    isOrdered = true;
                    break;
                } else {
                    return false;
                }
            }
            if (!isOrdered && words[i].length() > words[i + 1].length()) {
                return false;
            }
        }
        return true;        
    }
}