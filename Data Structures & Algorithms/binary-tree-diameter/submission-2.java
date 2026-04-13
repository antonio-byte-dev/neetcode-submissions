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
    int diameter = 0;
    public int subheight(TreeNode root)
    {
      if(root==null) return 0;
        else
        {
            int lheight = subheight(root.left);
            int rheight = subheight(root.right);
            diameter = Math.max(lheight+rheight,diameter);
            return 1 + Math.max(lheight,rheight);
        } 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        subheight(root);
        return diameter;
    }
}
