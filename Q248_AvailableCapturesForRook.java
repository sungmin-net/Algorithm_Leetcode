// https://leetcode.com/problems/available-captures-for-rook/

class Solution {
    public int numRookCaptures(char[][] board) {
        int output = 0;
        int[] row = {-1, 1, 0, 0};
        int[] col = {0, 0, -1, 1};
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board[0].length ; j++) {
                if (board[i][j] == 'R') {
                    for (int z = 0 ; z < 4 ; z++) {
                        output += find(new int[] {i, j}, new int[] {row[z], col[z]}, board);
                    }                                        
                }                                
            }
        }
        return output;        
    }
    
    private int find(int[] a, int[] flag, char[][] grid) {
        int k = 0;
        while (a[0] < grid.length && a[0] >= 0 && a[1] >= 0 && a[1] < grid[0].length
                && grid[ a[0] ][ a[1] ] != 'B' ) {
            if (grid[ a[0] ][ a[1] ] == 'p') {
                k = 1;
                break;
            }
            a[0] += flag[0];
            a[1] += flag[1];
        }
        return k;
    }
}