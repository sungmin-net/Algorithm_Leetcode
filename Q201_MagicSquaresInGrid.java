// https://leetcode.com/problems/magic-squares-in-grid/

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0 ; i < grid.length - 2 ; i++) {
            for (int j = 0 ; j < grid[0].length - 2 ; j++) {
                int map[] = new int[10];    // uses index 1 to 9
                boolean hasOneToNine = true;
                for (int k = i ; k < i + 3 ; k++) {
                    for (int l = j ; l < j + 3 ; l++) {
                        if (grid[k][l] > 9 || grid[k][l] < 1) {
                            hasOneToNine = false;
                            break;
                        }
                        map[grid[k][l]]++;
                        if (map[grid[k][l]] > 1) {
                            hasOneToNine = false;
                        }
                    }
                    if (!hasOneToNine) {
                        break;
                    }
                }
                if (!hasOneToNine) {
                    hasOneToNine = true;
                    continue;
                }
                if (grid[i][j] + grid[i][j + 1] + grid[i][j + 2] == 15
                        && grid[i][j] + grid[i + 1][j] + grid[i + 2][j] == 15
                        && grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] == 15) {
                    count++;
                }
            }
        }

        return count;
    }
}