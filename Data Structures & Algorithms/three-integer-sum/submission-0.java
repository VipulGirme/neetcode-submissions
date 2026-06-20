class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length -1;
            int target = nums[i] * -1;
            while (j < k) {
                if(nums[j] + nums[k] < target) {
                    j++;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    if(nums[j]+nums[k] == target) {
                        List<Integer> resp = Arrays.asList(nums[i],nums[j],nums[k]);
                        set.add(resp);
                        j++;
                        k--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
