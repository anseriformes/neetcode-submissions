class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<int[]> stack = new ArrayDeque<>(temperatures.length); //[index, temp]

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            
            //find values in stack that are less than current temp and assign intervals to result
            while (!stack.isEmpty() && stack.peek()[1] < temp) {
                int[] pair = stack.pop();
                result[pair[0]] = i - pair[0];
            }

            //add current temp to stack
            stack.push(new int[]{i, temp});
        }

        return result;
    }
}
