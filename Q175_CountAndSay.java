// https://leetcode.com/problems/count-and-say/

class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String exp = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1 ; i < exp.length() ; i++) {
            if (exp.charAt(i - 1) == exp.charAt(i)) {
                count++;
            } else {
                sb.append(count).append(exp.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(exp.charAt(exp.length() - 1));
        return sb.toString();                
    }
}