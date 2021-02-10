// https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }        
        for (int i = 0 ; i < num ; i++) {
            if (i * i == num) {
                return true;
            }
            if (i * i > num) {
                break;
            }
        }
        return false;                
    }
}