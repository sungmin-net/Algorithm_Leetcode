// https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {

    Queue<Integer> q = null;
    public MyStack() {
        q = new LinkedList<>();            
    }        
        
    // Push
    public void push(int x) {
        q.offer(x);
        int sz = q.size();
        while (sz > 1) {
            q.offer(q.poll());
            sz--;
        }
    }
        
    // Pop
    public int pop() {
        return q.remove();
    }
        
    // empty
    public boolean empty() {
        return q.isEmpty();
    }
        
    // peek
    public int top() {
        return q.peek();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */