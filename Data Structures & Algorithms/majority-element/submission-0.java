class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums) {
            if(map.containsKey(n)) {
                map.put(n,map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        int max = 0;
        int key = 0;
        for (Map.Entry m : map.entrySet()) {
            if(max < (Integer) m.getValue()) {
                key = (int) m.getKey();
                max = (int)m.getValue();
            }
        }
        return key;
    }
}