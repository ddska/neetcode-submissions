class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sortedNums[][] = new int [nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i][0] = nums[i];
            sortedNums[i][1] = i;
        }
        Arrays.sort(sortedNums, Comparator.comparingInt(a -> a[0]));
        int sum, i = 0, j = nums.length - 1;
        while ((i < nums.length) && (j >= 0)) {
            int val = sortedNums[i][0] + sortedNums[j][0];
            if (val == target) {
                int idx1 = sortedNums[i][1];
                int idx2 = sortedNums[j][1];
                return new int[] {Math.min(idx1, idx2), Math.max(idx1, idx2)};
            }
            if (val < target) {
                i++;
            } else if (val > target) {
                j--;
            }
        }
        return null;
    }
}
