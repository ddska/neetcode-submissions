class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i: nums) {
            Integer count = counts.getOrDefault(i, 0);
            counts.put(i, count + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> entries = counts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toCollection(ArrayList::new));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(entries.size() - 1 - i).getKey();
        }
        return result;
    }
}
