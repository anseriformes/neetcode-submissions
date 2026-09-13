class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean match = false;
        int left = 0;
        int right = numbers.length - 1;

        while (!match && left != right) {
            //advance right until we find a match for left
            while (numbers[left] + numbers[right] > target) {
                right--;
            }

            //if match found, set the result; else advance left
            if (numbers[left] + numbers[right] == target) {
                result[0] = left+1;
                result[1] = right+1;
                match = true;
            } else {
                left++;
            }
        }

        return result;
    }
}
