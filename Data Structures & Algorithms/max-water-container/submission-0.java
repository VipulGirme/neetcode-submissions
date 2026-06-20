class Solution {
    public int maxArea(int[] heights) {
          int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1; j < heights.length ; j++) {
                int water = (j-i)*Math.min(heights[i],heights[j]);
                max = Math.max(max,water);
            }
        }
        return max;
    }
}
