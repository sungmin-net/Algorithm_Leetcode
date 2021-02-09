// https://leetcode.com/problems/base-7/

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String ret = new String();
        int abs = Math.abs(num);
        while (abs > 0) {
            ret = (abs % 7) + ret;
            abs /= 7;
        }
        if (num < 0) {
            ret = "-" + ret;
        }
        return ret;                
    }
}