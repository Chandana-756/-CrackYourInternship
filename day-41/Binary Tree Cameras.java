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
  public int minCameraCover(TreeNode root) {
    int[] ans = dfs(root);
    return Math.min(ans[1], ans[2]);
  }
  private int[] dfs(TreeNode root) {
    if (root == null)
      return new int[] {0, 0, 1000};

    int[] l = dfs(root.left);
    int[] r = dfs(root.right);

    final int s0 = l[1] + r[1];
    final int s1 = Math.min(l[2] + Math.min(r[1], r[2]), r[2] + Math.min(l[1], l[2]));
    final int s2 = Math.min(l[0], Math.min(l[1], l[2])) + Math.min(r[0], Math.min(r[1], r[2])) + 1;

    return new int[] {s0, s1, s2};
  }
}

Time Complexity: O(n)
Space Complexity: O(h)
