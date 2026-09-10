class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        //map the frequency of each number
        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }

        //sort the map in reverse order, pick top k and return in array
        return frequency.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .map(e -> e.getKey())
        .limit(k)
        .mapToInt(Integer::intValue)
        .toArray();
    }
}
