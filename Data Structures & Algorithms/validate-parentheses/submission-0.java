class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(Char c:s.toCharArray()){
            if(c=='(') stk.push(')');
            else if(c=='{') stk.push('}');
            else if(c=='[') stk.push(']');

            else if(stk.isEmpty() || stk.pop!=c) return false;

        }

        return true;
    }
}
