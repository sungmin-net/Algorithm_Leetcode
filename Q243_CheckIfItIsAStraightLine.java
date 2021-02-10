// https://leetcode.com/problems/check-if-it-is-a-straight-line/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates == null || coordinates.length < 2) {
            return false;
        }
        if (coordinates.length == 2) {
            return true;
        }
        boolean isAllSameX = true;
        boolean isAllSameY = true;
        for (int i = 1 ; i < coordinates.length ; i++) {
            if (coordinates[0][0] != coordinates[i][0]) {
                isAllSameX = false;
            }
            if (coordinates[0][1] != coordinates[i][1]) {
                isAllSameY = false;
            }
        }
        if (isAllSameX || isAllSameY) {
            return true;
        }

        int diffX = coordinates[1][0] - coordinates[0][0];
        int diffY = coordinates[1][1] - coordinates[0][1];
        double lean = (double)diffY / (double)diffX;
        System.out.println(lean);

        for (int i = 2 ; i < coordinates.length ; i++) {
            double curLean = (double)(coordinates[i][1] - coordinates[i - 1][1]) /
                    (double)(coordinates[i][0] - coordinates[i - 1][0]);
            System.out.println(curLean);
            if (lean != curLean) {
                return false;
            }
        }
        return true;
    }
}