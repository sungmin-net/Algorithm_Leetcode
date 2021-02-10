// https://leetcode.com/problems/add-strings/

class Solution {
    public String addStrings(String num1, String num2) {
        boolean hasCarry = false;
        char[] num1chars = num1.toCharArray();
        char[] num2chars = num2.toCharArray();
        String ret = "";
        int idx = 1;
        while (idx <= num1.length() || idx <= num2.length()) {
            int unitSum = 0;
            if (idx <= num1.length()) {
                unitSum += num1chars[num1.length() - idx] - '0';
            }
//            System.out.println(unitSum);
            if (idx <= num2.length()) {
                unitSum += num2chars[num2.length() - idx] - '0';
            }
//            System.out.println(unitSum);
            if (hasCarry) {
                unitSum++;
            }
//            System.out.println(unitSum);
            if (unitSum >= 10) {
                hasCarry = true;
            } else {
                hasCarry = false;
            }
            ret = (unitSum % 10) + ret;
//            System.out.println(ret);
            idx++;
        }
        if (hasCarry) {
            ret = "1" + ret;
        }
        return ret;
    }
}