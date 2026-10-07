class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque();

        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];

            if (operation.equals("+")) {
                int score = stack.pop();
                int temp = score + stack.peek();

                stack.push(score);
                stack.push(temp);
            } else if (operation.equals("D")) {
                int score = stack.peek() * 2;

                stack.push(score);
            } else if (operation.equals("C")) {
                stack.pop();
            } else {
                stack.push(new Integer(operation));
            }
        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}