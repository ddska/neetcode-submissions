class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            List<String> anagramsList = anagrams.getOrDefault(sorted, new ArrayList<>());
            anagramsList.add(s);
            anagrams.put(sorted, anagramsList);
        }
        return new ArrayList<>(anagrams.values());
        
    }


}
