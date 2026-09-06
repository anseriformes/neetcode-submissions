class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int match = target - nums[i];

            int matchIndex = visited.getOrDefault(match, -1);

            //add to map if match not present; else set result and return
            if (matchIndex == -1) {
                visited.put(nums[i], i);
            } else {
                result[0] = matchIndex;
                result[1] = i;
                break;
            }
        }

        return result;
    }
}
