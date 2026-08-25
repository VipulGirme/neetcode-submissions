class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        int res = 0;
        for(int n: nums) {
           map.put(n, map.getOrDefault(n,0)+1);
           if(map.get(n)> maxCount) {
               res = n;
               maxCount = map.get(n);
           }
        }
        return res;
    }
}