class Solution {
    /**
        count sort
    **/
    public void sortColors(int[] nums) {

        //red = 0; white = 1; blue = 2
        int[] counts = new int[3];

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        int numsIndex = 0;

        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];

            while (count > 0) {
                nums[numsIndex] = i;
                count--;
                numsIndex++;
            }
        }
    }
}