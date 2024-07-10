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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        int max=0;
        int lh=find(root.left);
        int rh=find(root.right);
        max=Math.max(max, lh+rh);
        int r=diameterOfBinaryTree(root.left);
        int l=diameterOfBinaryTree(root.right);
        return max;
        
        
    }
      public  int find(TreeNode root) {
        if(root==null)
        return 0;
        int lh=find(root.left);
        int rh=find(root.right);
        return 1+Math.max(lh ,rh);
    }
}
