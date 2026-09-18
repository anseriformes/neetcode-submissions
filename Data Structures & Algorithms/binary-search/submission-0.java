class Solution {
    public int search(int[] nums, int target) {
        int result = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right && result == -1) {
            int mid = ((right - left) / 2) + left;

            if (nums[mid] == target) {
                result = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
