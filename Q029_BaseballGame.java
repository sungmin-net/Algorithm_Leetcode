// https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        int roundScore = 0;
        for (int i = 0 ; i < ops.length ; i++) {
            switch (ops[i]) {
            case "+" :
                int top = stack.pop();
                roundScore = stack.peek() + top;
                stack.push(top);
                sum += roundScore;
                stack.push(roundScore);
                break;
            case "D" :
                roundScore = stack.peek() * 2;
                sum += roundScore;
                stack.push(roundScore);
                break;
            case "C" :
                sum -= stack.pop();
                break;
            default :
                roundScore = Integer.valueOf(ops[i]);
                sum += roundScore;
                stack.push(roundScore);
            }
        }

        return sum;
    }
}