class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int x1 = nums[n-1] * nums[n-2] * nums[n-3];
        int x2 = nums[n-1] * nums[0] * nums[1];
        int ans = Math.max(x1,x2);
        return ans;
    }
}
Time Complexity: O(nlogn)
Space Complexity: O(1)
