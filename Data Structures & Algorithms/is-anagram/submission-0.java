class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> s_charCounts = new HashMap<>(26);
        Map<Character, Integer> t_charCounts = new HashMap<>(26);

        for (int i = 0; i < s.length(); i++) {
            s_charCounts.put(s.charAt(i), s_charCounts.getOrDefault(s.charAt(i),0) + 1);
            t_charCounts.put(t.charAt(i), t_charCounts.getOrDefault(t.charAt(i),0) + 1);
        }

        return s_charCounts.equals(t_charCounts);
    }
}
