class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] arr = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer> ls = map.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(Map.Entry::getKey).toList();
        for (int i = 0; i < k; i++) {
            arr[i] = ls.get(i);
        }
        return arr;
    }
}
