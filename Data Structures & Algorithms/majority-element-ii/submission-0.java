class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int k = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n :nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return  map.entrySet().stream().filter(x -> x.getValue() > k).map(Map.Entry::getKey).toList();
    }
}