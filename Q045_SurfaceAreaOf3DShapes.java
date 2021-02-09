// https://leetcode.com/problems/surface-area-of-3d-shapes/

class Solution {
    public int surfaceArea(int[][] grid) {
        int surfaces = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid.length ; j++) {
                // top & bottom
                if (grid[i][j] > 0) {
                    surfaces += 2;
                }
                // north surface
                if (i == 0) {
                    surfaces += grid[i][j];
                } else {
                    surfaces += (grid[i][j] > grid[i - 1][j]) ? grid[i][j] - grid[i - 1][j] : 0;
                }
                // west surface
                if (j == 0) {
                    surfaces += grid[i][j];
                } else {
                    surfaces += (grid[i][j] > grid[i][j - 1]) ? grid[i][j] - grid[i][j - 1] : 0;
                }
                // east surface
                if (j == grid.length - 1) {
                    surfaces += grid[i][j];
                } else {
                    surfaces += (grid[i][j] > grid[i][j + 1]) ? grid[i][j] - grid[i][j + 1] : 0;
                }
                // south surface
                if (i == grid.length - 1) {
                    surfaces += grid[i][j];
                } else {
                    surfaces += (grid[i][j] > grid[i + 1][j]) ? grid[i][j] - grid[i + 1][j] : 0;
                }
            }
        }
        return surfaces;
    }
}