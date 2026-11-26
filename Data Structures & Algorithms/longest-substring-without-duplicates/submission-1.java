class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            boolean exist = map.putIfAbsent(c, i) != null;
            if (exist) {
                max = Math.max(max, map.size());
                int pos = map.remove(c);
                //remove all chars from left to pos
                for (int k = left; k < pos; k++) {
                    map.remove(s.charAt(k));
                }
                left = pos + 1;
                exist = map.putIfAbsent(c, i) != null;
                assert (exist == false);
            }
            i++;
        }
        max = Math.max(max, map.size());
        return max;
    }
}
