// https://leetcode.com/submissions/detail/174616495/

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[0].length ; j++) {
                if (grid[ i ][ j ] == 1) {  // land
                    // check upper side
                    if (i == 0) {
                        perimeter++;
                    } else if (i > 0 && grid[i - 1][ j ]  == 0) {
                            perimeter++;
                    }
                    // check right side
                    if (j == grid[0].length - 1) {
                        perimeter++;
                    } else if (j < grid[0].length - 1 && grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                    // check left side
                    if (j == 0) {
                        perimeter++;
                    } else if (grid[ i ][ j - 1 ] == 0) {
                        perimeter++;
                    }
                    // check lower side
                    if (i == grid.length - 1) {
                        perimeter++;
                    } else if (i < grid.length - 1 && grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;        
    }
}