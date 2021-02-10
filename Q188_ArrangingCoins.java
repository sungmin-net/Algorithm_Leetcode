// https://leetcode.com/problems/arranging-coins/

class Solution {
    public int arrangeCoins(int n) {
        int total = n;
        for (int i = 0 ; i < total ; i++) {
            n = n - (i + 1);
//            System.out.println("n : " + n + ", i : " + i);
            if (n < 0) {
                return i;
            }
            if (n == 0) {
                return i + 1;
            }
        }
        return 0;
    }
}