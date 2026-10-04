class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;  //last populated index of nums1
        int i = nums1.length - 1;   //last index of nums1
        n = n - 1;  //last index of nums2

        //work backwards - whichever value is greater fills the last available index in nums1
        while (n >= 0) {
            if (m >= 0 && nums1[m] >= nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }

            i--;
        }
    }
}