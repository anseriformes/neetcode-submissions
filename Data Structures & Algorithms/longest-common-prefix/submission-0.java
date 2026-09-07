class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int j = 1;

            //keep checking until we reach the end of any string or the chars don't match
            while (j < strs.length && i < strs[j].length() && strs[j].charAt(i) == c) {
                j++;
            }
            
            //if we reach the end, add the char to the string; else break
            if (j == strs.length) {
                prefix = prefix.concat(Character.toString(c));
            } else {
                break;
            }
        }

        return prefix;
    }
}