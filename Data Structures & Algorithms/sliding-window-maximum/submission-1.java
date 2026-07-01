class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arrSize = nums.length - k + 1;
       int [] arr = new int[arrSize];
       int left = 0;
       while (left < arrSize) {
            int max = nums[left];
           for (int i = 0; i < k; i++) {
               max = Math.max(nums[i+left],max);
           }
           arr[left] = max;
           left++;
       }
        return arr;
    }
}
