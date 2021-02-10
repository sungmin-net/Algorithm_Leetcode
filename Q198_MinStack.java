// https://leetcode.com/problems/min-stack/

class MinStack {
    Stack<Integer> stack;
    List<Integer> list;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        list = new ArrayList<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        list.add(x);
        Collections.sort(list);
    }

    public void pop() {
        int a = stack.pop();
        list.remove(new Integer(a));
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return list.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */