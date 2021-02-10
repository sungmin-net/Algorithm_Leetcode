// https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        // fibonacci recursion
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3 ; i <= n ; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }    
}