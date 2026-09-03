class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack = new Stack<>();
     char [] chars = s.toCharArray();
     stack.add(chars[0]);
     for(int i = 1; i < chars.length; i++) {
        char c = chars[i];
        if(stack.empty()) {
            stack.add(c);
        } else {

            if(stack.peek() == '(' && c == ')') {
                stack.pop();
            } else if(stack.peek() == '{' && c == '}') {
                stack.pop();
            } else if(stack.peek() == '[' && c == ']') {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
     }
        return stack.isEmpty();
    }
}
