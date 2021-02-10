// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char popped = '\0';
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
               stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }                
                popped = stack.pop();
                switch (popped) {
                    case '(' :
                        if (c != ')') {
                            return false;
                        }
                        break;
                    case '[' :
                        if (c != ']') {
                            return false;
                        }
                        break;
                    case '{' :
                        if (c != '}') {
                            return false;
                        }
                        break;
                    default :
                        return false;
                }
            }
        }
        return stack.isEmpty();                
    }
}