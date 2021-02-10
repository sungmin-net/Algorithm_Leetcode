// https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        int first = 0;
        int second = 1;
        int third = 0;
        for (int i = 1 ; i < N ; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return second;                
    }
}