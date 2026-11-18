class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] res = new int[2];
        for(int i = 0; i < nums.length ;i++) {
            int rem = target - nums[i];
            if(map.containsKey(rem)) {
                res[1] = i;
                res[0] = map.get(rem); 
            } else {
                map.putIfAbsent(nums[i],i);
            }
        }
        return res;

    }
}
