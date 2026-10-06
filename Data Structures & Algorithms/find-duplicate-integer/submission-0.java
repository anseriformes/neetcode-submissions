class Solution {
    // hashset version
    public int findDuplicate(int[] nums) {
        int response = 0;

        Set<Integer> seen = new HashSet<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                response = nums[i];
                break;
            } else {
                seen.add(nums[i]);
            }
        }

        return response;
    }
}
