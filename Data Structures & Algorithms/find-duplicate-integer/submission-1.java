class Solution {
    // sort version
    public int findDuplicate(int[] nums) {
        int response = 0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                response = nums[i];
                break;
            }
        }

        return response;
    }
}
