// https://leetcode.com/problems/projection-area-of-3d-shapes/

class Solution {
    public int projectionArea(int[][] grid) {
        int planeXY = 0;
        int planeYZ = 0;
        int planeXZ = 0;
        for (int i=0 ; i < grid.length ; i++) {
            int maxZforX = 0;
            int maxZforY = 0;
            for (int j = 0 ; j < grid.length ; j++) {
                if (grid[i][j] > 0) {
                    planeXY++;
                }
                if (maxZforX < grid[i][j]) {
                    maxZforX = grid[i][j];
                }
                if (maxZforY < grid[j][i]) {
                    maxZforY = grid[j][i];
                }
            }
            planeXZ += maxZforX;
            planeYZ += maxZforY;
        }

//        System.out.println("planeXY : " + planeXY + ", planeYZ : " + planeYZ + ", planeXZ : " + planeXZ);
        return planeXY + planeYZ + planeXZ;
    }
}