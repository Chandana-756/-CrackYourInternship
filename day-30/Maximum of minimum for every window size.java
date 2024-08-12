class Solution {
    // Function to find the maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        
        int[] left = new int[n];  // Array to store previous smaller element indices
        int[] right = new int[n]; // Array to store next smaller element indices
        
        // Initialize left and right arrays
        for (int i = 0; i < n; i++) {
            left[i] = -1;   // If no smaller element on left, default to -1
            right[i] = n;   // If no smaller element on right, default to n
        }
        
        // Filling the elements of left[] to find previous smaller element for each index
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                left[i] = s.peek();
            }
            s.push(i);
        }
        
        // Clear the stack to reuse it for the right[] computation
        s.clear();
        
        // Filling the elements of right[] to find next smaller element for each index
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                right[i] = s.peek();
            }
            s.push(i);
        }
        
        // Array to store the maximum of minimums for every window size
        int[] ans = new int[n + 1];
        
        // Compute maximum of minimums for each window size
        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1; // Length of the window
            ans[len] = Math.max(ans[len], arr[i]);
        }
        
        // Fill the remaining entries in ans[] array
        for (int i = n - 1; i >= 1; i--) {
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }
        
        // Prepare the result array from ans[] by excluding the first element (which is unused)
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = ans[i];
        }
        
        return result;
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
