class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        // alternate with word1 as base until word1 complete
        while (i < word1.length()) {
            if (i < word2.length()) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            } else {
                result.append(word1.substring(i));
                i = word1.length();
            }

            i++;
        }

        // add remainder of word2 if longer than word1
        if (i < word2.length()) {
            result.append(word2.substring(i));
        }

        return result.toString();
    }
}