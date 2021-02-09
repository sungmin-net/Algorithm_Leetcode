// https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num >= 10) {
            sum = 0;
            sum += (num / 10);
            sum += (num % 10);
            num = sum;
        }

        return sum;                
    }
}