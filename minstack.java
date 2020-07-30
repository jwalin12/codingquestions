class MinStack {

    /** initialize your data structure here. */
    ArrayList<Integer> stack;
    
    public MinStack() {
        stack = new ArrayList<Integer>();
        
    }
    
    public void push(int x) {
        stack.add(x);
        
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (Integer i :stack) {
            if (i < min) {
                min = i;
            }
        }
        return min;
        
    }
}
