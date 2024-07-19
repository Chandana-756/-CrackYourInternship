class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String word = "";
        
        // Traverse the string and push words into the stack
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(!word.isEmpty()) {
                    st.add(word);
                    word = "";
                }
            } else {
                word = word + s.charAt(i);
            }
        }
        
        // Push the last word if it exists
        if(!word.isEmpty()) {
            st.add(word);
        }
        
        // Construct the result by popping words from the stack
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()) {
            res.append(st.pop());
            if(!st.isEmpty()) {
                res.append(" ");
            }
        }
        
        return res.toString();
    }
}

Time Complexity: O(N)
Space Complexity: O(N)
