class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        HashSet<Character> characterHashSet = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (characterHashSet.contains(s.charAt(r))) {
                characterHashSet.remove(s.charAt(l));
                l++;
            }
            characterHashSet.add(s.charAt(r));
            max = Math.max(r-l+1,max);
        }
        return max;

    }
}
