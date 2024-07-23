class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n-1))== 0);
    }
}

Time Complexity: O(1)
Space Complexity: O(1)
