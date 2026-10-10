class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = -1;
        int min = 0;
        int max = nums.length - 1;
        int mid = max / 2;

        while (result == -1 && max >= min) {
            mid = ((max - min) / 2) + min;

            if (target == nums[mid]) {
                result = mid;
            } else if (target < nums[mid]) {
                max = mid-1;
            } else {
                min = mid+1;
            }
        }

        //min last set to min+1, where we'd want to insert
        if (result == -1) {
            result = min;
        }

        return result;
    }
}