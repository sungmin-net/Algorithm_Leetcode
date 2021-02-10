// https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> s = new Stack<>();
        StringBuffer buf = new StringBuffer();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                s.push(c);
                if (s.size() != 1) {
                    buf.append(c);
                }
            }
            if (c == ')') {
                s.pop();
                if (s.size() != 0) {
                    buf.append(c);
                }
            }
        }
        return buf.toString();        
    }
}