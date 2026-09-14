class MinStack {
    private int curMin;
    private Deque<StoredInteger> stack;

    public MinStack() {
        stack = new ArrayDeque();
    }
    
    public void push(int val) {
        StoredInteger si = new StoredInteger();
        si.val = val;

        StoredInteger previous = stack.peek();

        if (previous == null) {
            si.prevMin = Integer.MAX_VALUE;
        } else {
            si.prevMin = Integer.min(previous.curMin, previous.prevMin);
        }

        si.curMin = Integer.min(val, si.prevMin);

        stack.push(si);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().curMin;
    }

    private class StoredInteger {
        int val;
        int prevMin;
        int curMin;
    }
}
