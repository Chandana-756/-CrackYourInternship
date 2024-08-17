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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();

        if(root == null) return ans;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            ans.add(subList);
        }
        return ans; 
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
