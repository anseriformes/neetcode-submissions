class Solution {
    public int mySqrt(int x) {
        int result = -1;
        
        int min = 0;
        int max = x / 2;    //check up to x/2 to reduce cycles
        int mid;
        long product;

        if (x < 2) {
            result = x;
        }

        while (max >= min && result == -1) {
            mid = ((max - min) / 2) + min;
            product = (long)mid * mid;

            if (product == x) {
                result = mid;
            } else if (product < x) {
                //check next value as well to account for integer rounding down, possibly allowing us to skip subsequent checks
                mid = mid + 1;

                if ((long)mid * mid > x) {
                    result = mid - 1;
                } else {
                    min = mid;
                }
            } else {
                max = mid - 1;
            }
        }

        return result;
    }
}