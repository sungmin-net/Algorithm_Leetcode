// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

class Solution {
    public int minCostToMoveChips(int[] chips) {
        int v1 = 0;
        int v2 = 0;
        for (int i : chips) {
            if (i % 2 == 0) {
                v1++;
            } else {
                v2++;
            }
        }
        return v1 < v2 ? v1 : v2;             
    }
}