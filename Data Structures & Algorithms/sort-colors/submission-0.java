class Solution {
    /**
        "sort" by counting each value and overwriting
    **/
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                red++;
            } else if (nums[i] == 1) {
                white++;
            } else {
                blue++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (red > 0 && i < red) {
                nums[i] = 0;
            } else if (white > 0 && i >= red && i < red + white) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}