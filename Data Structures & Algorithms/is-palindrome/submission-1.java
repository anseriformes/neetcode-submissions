class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        boolean result = true;

        while (left < right) {
            char leftVal = s.charAt(left);
            char rightVal = s.charAt(right);
            boolean skip = false;

            //skip non-alphanumeric characters
            if (!isAlphanumeric(leftVal)) {
                left++;
                skip = true;              
            }

            if (!isAlphanumeric(rightVal)) {
                right--;
                skip = true;
            }

            //both values are alphanumeric, compare; else skip to next valid comparison
            if (!skip) {
                leftVal = toLowerCase(leftVal);
                rightVal = toLowerCase(rightVal);

                //chars match, continue checking; else break - no palindrome
                if (leftVal == rightVal) {
                    left++;
                    right--;
                } else {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    //0-9 -> 48-57 ascii
    //A-Z -> 65-90
    //a-z -> 97-122
    private boolean isAlphanumeric(char c) {
        return ((c >= 48 && c <= 57) 
            || (c >= 65 && c <= 90)
            || (c >= 97 && c <= 122));
    }

    private char toLowerCase(char c) {
        return (c >= 65 && c <= 90) ? c += 32 : c;
    }
}
