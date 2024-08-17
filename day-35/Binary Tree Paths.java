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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if(root == null) return result;

        String curr_path = Integer.toString(root.val);

        if(root.left == null && root.right == null) result.add(curr_path);
        if(root.left != null) dfs(root.left,curr_path,result);
        if(root.right != null) dfs(root.right,curr_path,result);
        return result;
    }
    public void dfs(TreeNode node,String curr_path,List<String> result){
        curr_path += "->" + node.val;
        
        if(node.left == null && node.right == null){
            result.add(curr_path);
            return;
        } 
        
        if(node.left != null) dfs(node.left,curr_path,result);
        if(node.right != null) dfs(node.right,curr_path,result);
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
