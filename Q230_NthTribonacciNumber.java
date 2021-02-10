// https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        }
        if (n == 2) {
            return 1;
        }        
        int first = 0;
        int second = 1;
        int third = 1;
        for (int i = 2; i < n; i++) {
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
        }
        return third;                
    }
}