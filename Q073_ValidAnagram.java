// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }
        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);
//        System.out.println(charsS);
        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);
//        System.out.println(charsT);
        for (int i = 0 ; i < s.length() ; i++) {
            if (charsS[i] != charsT[i]) {
                return false;
            }
        }
        return true;        
    }
}