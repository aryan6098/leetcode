class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!st.empty() && s.charAt(i) == '*') {
                st.pop();
            }else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();
        while(!st.empty()) {
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}