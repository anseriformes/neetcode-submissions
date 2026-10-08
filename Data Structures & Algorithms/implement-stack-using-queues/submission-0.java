class MyStack {
    Deque<Integer> queue;
    int size;

    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    //add an element to the top of the stack (end of the queue)
    public void push(int x) {
        queue.push(x);
        size++;
    }
    
    //remove the top element of the stack (pop from the queue until the end, replacing all elements in the stack except the last)
    public int pop() {
        int i = 0;
        while (i < size) {
            queue.push(queue.pop());
            i++;
        }

        size--;
        return queue.pop();
    }
    
    //return the top element of the stack (pop from the queue until the end, replacing all elements in the stack)
    public int top() {
        int result = pop();

        push(result);

        return result;
    }
    
    //return whether stack is empty or not
    public boolean empty() {
        return size == 0;
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