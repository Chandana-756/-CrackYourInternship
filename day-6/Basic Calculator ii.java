class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0) return 0;

        //Stack<Integer> st = new Stack<>();
        int curr = 0;
        char opr = '+';
        char[] ch = s.toCharArray();
        int sum = 0;
        int last = 0;

        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                curr = curr*10 + ch[i] - '0';
            }
            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length - 1){
                if(opr == '+'){
                    sum += last;
                    //st.push(curr);
                    last = curr;
                }
                else if(opr == '-'){
                    sum += last;
                    //st.push(-curr);
                    last = -curr;
                }
                else if(opr == '*'){
                    //st.push(st.pop() * curr);
                    last = last * curr;
                }
                else if(opr == '/'){
                    //st.push(st.pop() / curr);
                    last = last / curr;
                }
                opr = ch[i];
                curr = 0;
            }
        }
        /*int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }*/
        sum += last;
        return sum;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
