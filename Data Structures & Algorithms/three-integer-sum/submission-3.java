class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return result;
        Arrays.sort(nums);
        int prev = nums[0] + 1;
        for (int i = 0; i < len - 2; i++) {
            int val = nums[i];
            if (val > 0) break;
            if (val == prev) continue;
            prev = val;

            int left = i + 1;
            int right = len - 1;

            while ((right > left)) {
                int sum = val + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(new ArrayList<>(List.of(val, nums[left], nums[right])));
                    right--;
                    
                    while ((left < len - 1) && (nums[left] == nums[left+1])) {
                        left++;
                    }
                    left++;
                }
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }
                
            }
        }

        return result;
    }
}
