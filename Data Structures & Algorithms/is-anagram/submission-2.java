class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i <s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))) {
                map.compute(t.charAt(i), (k, val) -> val - 1);
            }
        }
       Optional<Integer> value = map.values().stream().filter(x -> x != 0).findFirst();
        if(value.isEmpty()) return true;
        return false;
    }
}
