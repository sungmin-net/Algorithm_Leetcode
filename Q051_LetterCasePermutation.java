// https://leetcode.com/problems/letter-case-permutation/

class Solution {
    public List<String> letterCasePermutation(String S) {
        StringNode rt = new StringNode("");
        Stack<StringNode> stack = new Stack<StringNode>();
        stack.push(rt);
        char[] chars = S.toCharArray();
        int idx = 0;
        char curChar;
        List<String> ret = new ArrayList<String>();
        while (!stack.isEmpty()) {
            StringNode curNode = stack.pop();
            idx = curNode.string.length();
            // append
            while (idx < chars.length && !Character.isLowerCase(chars[idx]) && !Character.isUpperCase(chars[idx])) {
                curNode.string += chars[idx++];
            }
            if (curNode.string.length() == S.length()) {
                ret.add(curNode.string);
            }

            if (idx < chars.length) {
                curChar = chars[idx];
                curNode.lower = new StringNode(curNode.string + String.valueOf(Character.toLowerCase(curChar)));
                curNode.upper = new StringNode(curNode.string + String.valueOf(Character.toUpperCase(curChar)));
                stack.push(curNode.upper);
                stack.push(curNode.lower);
            }
        }
        return ret;
    }

    public static class StringNode {
        String string;
        StringNode lower;
        StringNode upper;
        public StringNode (String c) {
            this.string = c;
        }
    }
}