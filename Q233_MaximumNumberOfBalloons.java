// https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[ 26 ];
        int[] cntBalloon = new int[ 26 ];
        for (int i = 0 ; i < text.length() ; i++) {
            ++cnt[text.charAt(i) - 'a'];
        }
        int min = text.length();
        for (char c : "balloon".toCharArray()) {
            ++cntBalloon[c - 'a'];
        }
        for (char c : "balloon".toCharArray()) {
            min = Math.min(min, cnt[c - 'a'] / cntBalloon[c - 'a']);
        }
        return min;                
    }
}