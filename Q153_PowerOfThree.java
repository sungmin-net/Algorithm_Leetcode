// https://leetcode.com/problems/power-of-three/

class Solution {
    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }
        double power = Math.log10(n) / Math.log10(3);
        return power == Math.ceil(power);
        
    }
}