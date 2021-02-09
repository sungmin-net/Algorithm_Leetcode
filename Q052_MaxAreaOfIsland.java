// https://leetcode.com/problems/max-area-of-island/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];


        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[0].length ; j++) {
                if (visited[i][j]) {
                    continue;
                }
                if (grid[i][j] == 1) {
                    int curArea = 0;
                    Stack<Land> stack = new Stack<Land>();
                    stack.push(new Land(i, j));
                    visited[i][j] = true;
                    while (!stack.isEmpty()) {
                        Land poped = stack.pop();
                        curArea++;
//                        System.out.println("[" + curArea + "] Poped : " + poped.i + ", " + poped.j);
                        // east
                        if (poped.j != grid[0].length - 1 && visited[poped.i][poped.j + 1] == false
                                && grid[poped.i][poped.j + 1] == 1) {
//                            System.out.println("east");
                            stack.push(new Land(poped.i, poped.j + 1));
                            visited[poped.i][poped.j + 1] = true;
                        }
                        // north
                        if (poped.i != 0 && visited[poped.i - 1][poped.j] == false
                                && grid[poped.i - 1][poped.j] == 1) {
//                            System.out.println("north");
                            stack.push(new Land(poped.i - 1, poped.j));
                            visited[poped.i - 1][poped.j] = true;
                        }
                        // west
                        if (poped.j != 0 && visited[poped.i][poped.j - 1] == false
                                && grid[poped.i][poped.j - 1] == 1) {
//                            System.out.println("west");
                            stack.push(new Land(poped.i, poped.j - 1));
                            visited[poped.i][poped.j - 1] = true;
                        }
                        // south
                        if (poped.i != grid.length - 1 && visited[poped.i + 1][poped.j] == false
                                && grid[poped.i + 1][poped.j] == 1) {
//                            System.out.println("south");
                            stack.push(new Land(poped.i + 1, poped.j));
                            visited[poped.i + 1][poped.j] = true;
                        }
                    }
                    System.out.println("current area : " + curArea);
                    maxArea = Math.max(maxArea, curArea);
                } else {
                    visited[i][j] = true;
                }
            }
        }

        return maxArea;                
    }
    
    public static class Land {
        int i;
        int j;
        public Land(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }    
}