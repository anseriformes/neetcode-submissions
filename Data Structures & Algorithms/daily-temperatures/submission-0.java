class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            int right = i + 1;

            //find span to next higher temp, else keep value as 0
            while (right < temperatures.length) {
                if (temperatures[right] > temp) {
                    result[i] = right - i;
                    break;
                }
                
                right++;
            }
        }

        return result;
    }
}
