// https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int len = p.length();
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0 ; i <= s.length() - len ; i++) {
            if (isAnagram(s.substring(i, i + len), p)) {
                ret.add(i);
            }
        }
        return ret;                
    }
    
    public static boolean isAnagram(String s, String t) {
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