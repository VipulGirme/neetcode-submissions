class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(String s : strs) {
            ans.append((char) s.length()).append(s);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        int n = str.length();
        while(i < n) {
            int size = str.charAt(i++);
            res.add(str.substring(i,i+size));
            i += size;
        }
        return res;
    }
}
