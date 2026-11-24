class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxSquare = 0;
        while (left < right) {
            int square = Math.min(heights[left], heights[right]) * (right - left);
            maxSquare = Math.max(maxSquare, square);
            if (heights[left] > heights[right]) {
                right--;
            } else if (heights[left] < heights[right]) {
                left++;
            } else {
                int nextRightVal = heights[right - 1];
                int nextLeftVal = heights[left + 1];
                if (nextRightVal > nextLeftVal) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return maxSquare;
    }
}
