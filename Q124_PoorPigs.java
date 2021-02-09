// https://leetcode.com/problems/poor-pigs/

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int round = minutesToTest / minutesToDie;
        int pigs = 0;
        while  (Math.pow(round + 1, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}