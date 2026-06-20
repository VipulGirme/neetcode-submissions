class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) +1 );
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) ->(b.getValue() - a.getValue()));
        queue.addAll(map.entrySet());
        int [] res = new int[k];
        int i = 0;
        while (k != 0) {
            res[i] = queue.poll().getKey();
            i++;
            k--;
        }
        return res;
    }
}
