class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> stack = new Stack<>();
 
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            
            if (Character.isDigit(ch))
                stack.push(ch - '0');
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
 
                switch (ch) {
                case '+':
                    stack.push(val2 + val1);
                    break;
                case '-':
                    stack.push(val2 - val1);
                    break;
                case '/':
                    stack.push(val2 / val1);
                    break;
                case '*':
                    stack.push(val2 * val1);
                    break;
                }
            }
        }
        return stack.pop();
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
