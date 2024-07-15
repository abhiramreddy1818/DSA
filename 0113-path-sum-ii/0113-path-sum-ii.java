import java.util.ArrayList;
import java.util.List;

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        find(root, targetSum, new ArrayList<>(), ans);
        return ans;
    }
    
    public void find(TreeNode root, int k, List<Integer> list, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        
        list.add(root.val);
        k = k - root.val;
        
        if (k == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(list));  // Add a copy of the list
        } else {
            find(root.left, k, list, ans);
            find(root.right, k, list, ans);
        }
        
        list.remove(list.size() - 1);  // Backtrack to remove the current node
    }
}
