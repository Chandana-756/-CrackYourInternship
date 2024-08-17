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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightView(root,0,res);
        return res;
    }
    public void rightView(TreeNode node, int level, List<Integer> res){
        if(node == null) return;
        if(level == res.size()) res.add(node.val);
        rightView(node.right,level+1,res);
        rightView(node.left,level+1,res);
    }
}

Time Complexity: O(n)
Space Complexity: O(h)
