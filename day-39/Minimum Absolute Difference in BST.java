/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public int getMinimumDifference(TreeNode root) {
    int ans = Integer.MAX_VALUE;
    int prev = -1;
    Deque<TreeNode> stack = new ArrayDeque<>();

    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (prev >= 0)
        ans = Math.min(ans, root.val - prev);
      prev = root.val;
      root = root.right;
    }

    return ans;
  }
}

Time Complexity: O(n)
Space Complexity: O(log n)
