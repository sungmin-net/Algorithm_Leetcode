// https://leetcode.com/problems/rotting-oranges/

class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] DIRECTIONS = {{1, 0} /*right*/,{-1, 0}/*left*/, {0, 1}/*up*/, {0, -1}/*down*/};
        int xs = grid.length;
        int ys = grid[0].length;
        class Orange {
            int x;
            int y;
            public Orange(int x, int y) {
                this.x = x;
                this.y = y;
            }
        };
        int fresh = 0;
        Queue<Orange> rottens = new LinkedList<>();
        for (int i = 0 ; i < xs ; i++) {
            for (int j = 0 ; j < ys ; j++) {
                if (grid[i][j] == 2) {
                    rottens.offer(new Orange(i, j));
                }
                if (grid[i][j] == 1) {
                    fresh++;
                    boolean isIsolated = true;
                    // left
                    if (i > 0 && grid[i-1][j] != 0) {
                        isIsolated = false;
                    }
                    // right
                    if (i + 1 < xs && grid[i+1][j] != 0) {
                        isIsolated = false;
                    }
                    // up
                    if (j + 1 < ys && grid[i][j + 1] != 0) {
                        isIsolated = false;
                    }
                    // down
                    if (j > 0 && grid[i][j - 1] != 0) {
                        isIsolated = false;
                    }
                    if (isIsolated) {
                        return -1;
                    }
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }
        if (rottens.size() == 0) {
            return -1;
        }

        int time = 0;
        while (!rottens.isEmpty()) {
            time++;
            int curSize = rottens.size();
            for (int i = 0 ; i < curSize ; i++) {
                Orange cur = rottens.poll();
                for (int[] DIR : DIRECTIONS) {
                    int x = cur.x + DIR[0];
                    int y = cur.y + DIR[1];
                    if (x < 0 || y < 0 || x >= xs || y >= ys
                            || grid[x][y] == 0 || grid[x][y] == 2) {
                        continue;
                    }
                    grid[x][y] = 2;
                    rottens.offer(new Orange(x, y));
                    fresh--;
                }
            }
        }

        return fresh == 0 ? time - 1 : -1;
    }
}