// https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        char[] charsFromT = t.toCharArray();
        char[] charsFromS = s.toCharArray();
        Arrays.sort(charsFromS);
        Arrays.sort(charsFromT);

        for (int i = 0 ; i < s.length() ; i++) {
            if (charsFromS[i] != charsFromT[i]) {
                return charsFromT[i];
            }
        }

        return charsFromT[ charsFromT.length - 1 ];
    }
}