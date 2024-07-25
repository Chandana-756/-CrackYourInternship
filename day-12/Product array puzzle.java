class Solution {
    public static long[] productExceptSelf(int nums[], int n) {
        long[] l = new long[n];
        long[] r = new long[n];
        long[] result = new long[n];
        
        // Initialize the first element of left product array
        l[0] = 1;
        // Initialize the last element of right product array
        r[n - 1] = 1;
        
        // Fill left product array
        for (int i = 1; i < n; i++) {
            l[i] = l[i - 1] * nums[i - 1];
        }
        
        // Fill right product array
        for (int i = n - 2; i >= 0; i--) {
            r[i] = r[i + 1] * nums[i + 1];
        }
        
        // Calculate the result array
        for (int i = 0; i < n; i++) {
            result[i] = l[i] * r[i];
        }
        
        return result;
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
  
