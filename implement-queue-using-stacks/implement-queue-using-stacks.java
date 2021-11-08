class MyQueue {
    Stack<Integer> stack,dupStack;
    public MyQueue() {
        stack = new Stack<Integer>();
        dupStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!dupStack.empty()) stack.push(dupStack.pop());
        stack.push(x);
    }
    
    public int pop() {
        while(!stack.empty()) dupStack.push(stack.pop());
        return dupStack.pop();
    }
    
    public int peek() {
        while(!stack.empty()) dupStack.push(stack.pop());
        return dupStack.peek();
    }
    
    public boolean empty() {
        while(!stack.empty()) dupStack.push(stack.pop());
        return dupStack.empty();
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