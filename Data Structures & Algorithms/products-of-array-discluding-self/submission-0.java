class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        pre[0] = 1;
        post[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = nums[i - 1] * pre[i-1];
            post[nums.length - 1 - i] = nums[nums.length - i] * post[nums.length - i];
        }
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = pre[i] * post[i];
        }
        result[0] = post[0];
        result[nums.length - 1] = pre[nums.length - 1];
        return result;
    }
}  
