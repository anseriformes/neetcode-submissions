class Solution {
    /** sort the chars in each string and add original string to map keyed on the sorted value - all anagrams will map to the same key; return lists of each key **/
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> response = new ArrayList<>();

        Map<String, List<String>> sortedMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] strChars = strs[i].toCharArray();
            Arrays.sort(strChars);

            String sorted = new String(strChars);

            List<String> strings = sortedMap.getOrDefault(sorted, new ArrayList<>());
            strings.add(strs[i]);
            sortedMap.put(sorted, strings);
        }

        return new ArrayList<>(sortedMap.values());
    }
}
