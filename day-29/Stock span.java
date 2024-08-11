gfg solution:
class Solution {
    // Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        int[] spans = new int[n];
        spans[0] = 1;
        Stack<Integer> indexStack = new Stack<>();
        
        indexStack.push(0);
        
        for(int i=1;i<n;i++){
            while(!indexStack.isEmpty() && price[indexStack.peek()] <= price[i])
              indexStack.pop();
              
            if(indexStack.isEmpty()) spans[i] = i + 1;
            else spans[i] = i - indexStack.peek();
            indexStack.push(i);
        }
        return spans;
    }
}

leetcode solution:
class StockSpanner {

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek().getKey() <= price)
        span += stack.pop().getValue();
        stack.push(new Pair<>(price, span));
        return span;
    }
    private Stack<Pair<Integer,Integer>> stack = new Stack<>();
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

Time Complexity: O(n)
Space Complexity: O(n)
