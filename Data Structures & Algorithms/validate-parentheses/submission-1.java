class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parenth = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        parenth.put(')', '(');
        parenth.put(']', '[');
        parenth.put('}', '{');

        for(char c : s.toCharArray()){
            if(parenth.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == parenth.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
