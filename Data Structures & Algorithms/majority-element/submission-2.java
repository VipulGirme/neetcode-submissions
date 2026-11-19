class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n,1);
            }
        }
        map.values().removeIf(v -> v <= nums.length / 2);
        if(!map.isEmpty()) {
            return map.keySet().iterator().next();
        }
        return 0;
    }
}