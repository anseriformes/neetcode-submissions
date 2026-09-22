class Solution {
    public int removeDuplicates(int[] nums) {
        int left = -1;

        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length - 1 && nums[i] == nums[i+1]) {
                i++;
            }

            if (left != i) {
                left++;
                nums[left] = nums[i];
            }
        }

        return left + 1;
    }
}