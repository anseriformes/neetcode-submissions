class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            //overwrite index when required
            if (nums[i] != val) {
                if (left != i) {
                    nums[left] = nums[i];
                }
                
                left++;
            }
        }

        return left;
    }
}