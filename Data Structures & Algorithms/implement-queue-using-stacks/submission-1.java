class MyQueue {
    Stack<Integer> stack;
    int size = 0;

    public MyQueue() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[i] = stack.pop();
        }

        stack.push(x);

        for (int i = size - 1; i >= 0; i--) {
            stack.push(temp[i]);
        }

        size++;
    }
    
    public int pop() {
        size--;

        return stack.pop();
    }
    
    public int peek() {
        return stack.peek();
    }
    
    public boolean empty() {
        return size == 0;
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