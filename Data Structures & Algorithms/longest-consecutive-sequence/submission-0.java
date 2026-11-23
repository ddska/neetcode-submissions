class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i: nums) {
            s.add(i);
        }
        int longest = 0;
        for (Integer i: s) {
            int length = 1;
            if (!s.contains(i - 1)) {
                while (s.contains(i + length)) {
                    length++;
                }
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
