class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0) return  0;
        Arrays.sort(nums);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int count = 0;
        int ans = 0;
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] - arr[i] == 1 ){
                count++;
            } else{
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans + 1;
    }
}
