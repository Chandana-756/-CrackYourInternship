class Solution {
    public int missingNumber(int[] nums) {
        int sumOfArray = 0, n = nums.length;

        for(int i=0;i<n;i++) sumOfArray+= nums[i];

        int sumFrom1ToN = (n * (n+1)) / 2;

        int missing = sumFrom1ToN - sumOfArray;

        return missing;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
