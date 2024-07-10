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
        if(root==null)
        return true;
       
       
        return find(root) !=-1;
    }
    public int  find (TreeNode root){
        if(root==null)
         return 0;
         int lh=find(root.left);
         int rh=find(root.right);
         if(lh ==-1 || rh==-1)
         return -1;
        if(Math.abs(rh-lh)>1)
                return -1;
         return 1+Math.max(rh,lh); 
    }
}