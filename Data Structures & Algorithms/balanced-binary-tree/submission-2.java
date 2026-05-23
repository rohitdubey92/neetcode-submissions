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

    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    private int dfs(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);

        // left subtree already unbalanced
        if (left == -1) {
            return -1;
        }

        int right = dfs(node.right);

        // right subtree already unbalanced
        if (right == -1) {
            return -1;
        }

        // current node becomes unbalanced
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        // return height
        return Math.max(left, right) + 1;
    }
}
