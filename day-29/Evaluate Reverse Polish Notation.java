class Solution {
    private int Operate(int val1, int val2, String token) {
        switch (token) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return (int)((long)val1 * (long)val2);
            case "/":
                if (val2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return val1 / val2;
            default:
                return -1;
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int val2 = st.pop();
                int val1 = st.pop();
                int result = Operate(val1, val2, token);
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
