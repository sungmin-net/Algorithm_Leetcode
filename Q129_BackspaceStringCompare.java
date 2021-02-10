// https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        if (S == null && T == null) {
            return true;
        }
        if (S == null || T == null) {
            return false;
        }

        Stack<Character> stackS = new Stack<Character>();
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!stackS.isEmpty()) {
                    stackS.pop();
                }
            } else {
                stackS.push(c);
            }
        }

        Stack<Character> stackT = new Stack<Character>();
        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!stackT.isEmpty()) {
                    stackT.pop();
                }
            } else {
                stackT.push(c);
            }
        }

        while (!stackS.isEmpty() && !stackT.isEmpty()) {
            char s = stackS.pop();
            char t = stackT.pop();
            if (s != t) {
                return false;
            }
        }

        if (stackS.isEmpty() && stackT.isEmpty()) {
            return true;
        }
        return false;
    }
}