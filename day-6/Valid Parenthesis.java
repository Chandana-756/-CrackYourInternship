class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
                continue;
            }
            if(st.isEmpty()) return false;
            char check;
            switch(ch){
                case ')' :
                  check = st.pop();
                  if(check == '{' || check == '[')
                    return false;
                    break;
                case ']' :
                  check = st.pop();
                  if(check == '(' || check == '{')
                    return false;
                    break;
                case '}' :
                  check = st.pop();
                  if(check == '(' || check == '[')
                    return false;
                    break;
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}
Time Complexity: O(N)
Space Complexity: O(N)
