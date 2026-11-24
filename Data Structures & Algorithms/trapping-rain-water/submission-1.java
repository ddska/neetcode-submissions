class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;
        int total = 0;
        int vol = 0;
        int l = 1;
        int r = height.length - 2;
        int[] pre = new int[height.length]; //talles on the left
        int[] post = new int[height.length]; //tallest on the right
        pre[0] = 0;
        post[height.length - 1] = 0;
        for (int i = 1; i < height.length - 1; i++) {
            pre[l] = Math.max(height[l - 1], pre[l - 1]);
            post[r] = Math.max(height[r + 1], post[r + 1]);
            r--;
            l++;
        }
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            int minHeight = Math.min(pre[i], post[i]);
            if (minHeight > height[i]) {
                res += minHeight - height[i];
            }
        }
        return res;
    }
}
