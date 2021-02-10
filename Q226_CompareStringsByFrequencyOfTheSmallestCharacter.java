// https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        
        int[] ret = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int qFreq = getSmallCharacterFrequency(queries[i]);
            for (String w : words) {
                int wFreq = getSmallCharacterFrequency(w);
                if (qFreq < wFreq) {
                    ret[i]++;
                }
            }
        }
        return ret;                
    }
    
    private int getSmallCharacterFrequency(String s) {
        char[] chars = s.toCharArray();
        char small = chars[0];
        char freq = 1;
        for (int i = 1; i < chars.length; i++) {
            if (small == chars[i]) {
                freq++;
            } else if (small > chars[i]) {
                small = chars[i];
                freq = 1;
            }
        }
        return freq;
    }    
}