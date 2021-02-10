// https://leetcode.com/problems/flower-planting-with-no-adjacent/

class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] ret = new int[N];
        Arrays.fill(ret, 1);    // Initialy, every node has color 1.
        boolean stop = false;
        do {
            stop = true;
            for (int[] edge : paths) {
                int u = Math.min(edge[0], edge[1]);
                int v = Math.max(edge[0], edge[1]);
                if (ret[u - 1] == ret[v - 1]) {
                    stop = false;
                    ret[v - 1] = ret[v - 1] == 4 ? 1 : ret[v - 1] + 1;
                }
            }
        } while(!stop);
       return ret;           
    }
}