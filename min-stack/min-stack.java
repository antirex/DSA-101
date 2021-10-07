class MinStack {
    Deque<Integer> stack = new ArrayDeque<Integer>();
    public MinStack() {
        stack = new ArrayDeque<Integer>();
    }
    
    public void push(int val) {
        
        stack.push(val);
    }
    
    public void pop() {
        
        stack.pop();
    }
    
    public int top() {
        
        return stack.peek();
    }
    
    public int getMin() {
        Object array[] = stack.toArray();
        int min = (Integer)array[0];
        for(int i =1;i<array.length;i++){
            if(min>(Integer)array[i]) min = (Integer)array[i];
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */