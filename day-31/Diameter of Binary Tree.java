class Solution {
    static int diameter;
	int getMaxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftSubtreeDepth = getMaxDepth(root.left);
		int rightSubtreeDepth = getMaxDepth(root.right);
		diameter = Math.max(diameter, leftSubtreeDepth + rightSubtreeDepth);
		return Math.max(leftSubtreeDepth, rightSubtreeDepth) + 1;
	}
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
		getMaxDepth(root);
		return diameter;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
