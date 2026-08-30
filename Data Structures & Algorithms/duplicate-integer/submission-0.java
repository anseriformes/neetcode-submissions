class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        Set<Integer> visited = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (visited.contains(nums[i])) {
                duplicate = true;
                break;
            } else {
                visited.add(nums[i]);
            }
        }

        return duplicate;
    }
}