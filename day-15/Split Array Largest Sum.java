class Solution {
    public int splitArray(int[] nums, int k) {
        int maxNum = 0;
        int totalSum = 0;
        
        // Calculate the sum of all elements and the maximum element
        for (int num : nums) {
            totalSum += num;
            maxNum = Math.max(num, maxNum);
        }
        
        // If k equals the number of elements, the largest sum is the largest single element
        if (k == nums.length) {
            return maxNum;
        }

        // Initialize binary search bounds
        int low = maxNum;
        int high = totalSum;
        int answer = 0;
        
        // Binary search to find the minimum largest sum
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if it's possible to split with max sum `mid`
            if (isPossible(nums, mid, k)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    // Helper function to determine if we can split the array into `k` parts with max sum `mid`
    public static boolean isPossible(int[] nums, int maxSum, int k) {
        int subarrayCount = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            // If current sum exceeds maxSum, we need a new subarray
            if (currentSum > maxSum) {
                subarrayCount++;
                currentSum = num;
            }
        }
        return subarrayCount <= k;
    }
}

Time Complexity: O(nlogn)
Space Complexity: O(1)
