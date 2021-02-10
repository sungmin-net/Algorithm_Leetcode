// https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue {
    
    Stack<Integer> stack;
    Stack<Integer> temp;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();                
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int ret = -1;
        if (stack.isEmpty()) {
            return ret;
        } else {
            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            ret = temp.pop();
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        return ret;
    }
    
    /** Get the front element. */
    public int peek() {
        int ret = -1;
        if (stack.isEmpty()) {
            return ret;
        } else {
            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            ret = temp.peek();
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        return ret;                
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */