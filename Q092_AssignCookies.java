// https://leetcode.com/problems/assign-cookies/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ret = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0 ; i < g.length ; i++) {
            for (int j = 0 ; j < s.length ; j++) {
                if (g[ i ] <= s[ j ]) {
                    ret++;
                    s[ j ] = -1;
                    break;
                }
            }
        }
        return ret;
    }
}