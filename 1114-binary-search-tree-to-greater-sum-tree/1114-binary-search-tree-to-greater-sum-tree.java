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
    public TreeNode bstToGst(TreeNode temp) {
        Stack<TreeNode> stack= new Stack<>();
        TreeNode root=temp;
        if(root==null)
        return root;
        
        while(root!=null){
            stack.push(root);
            root=root.right;
        }
        int sum=0;
        while(!stack.isEmpty()){
            TreeNode curr=stack.pop();
            sum+=curr.val;
            curr.val=sum;
            
            curr=curr.left;
             while(curr!=null){
                stack.push(curr);
                 curr=curr.right;
             }
        }
        return temp;
    }
}