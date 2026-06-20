class Solution {
public static String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String s : strs) {
        // Format: [length] + [#] + [string]
        sb.append(s.length()).append("#").append(s);
    }
    return sb.toString();
}

public static List<String> decode(String str) {
    List<String> res = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        // Find the delimiter after the length
        int j = str.indexOf('#', i);
        int length = Integer.parseInt(str.substring(i, j));
        i = j + 1;
        
        // Extract the string based on the parsed length
        res.add(str.substring(i, i + length));
        i += length;
    }
    return res;
}
}
