class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int a[] = {-1,k};
        find(root,a);
        return a[0];
    }
    
    public void find(TreeNode root, int[] a) {
        if (root == null) {
            return;
        }
        find(root.left, a);
        a[1] = a[1] - 1;
        if (a[1] == 0) {
            a[0] = root.val;
            return;
        }
        find(root.right,a);
    }
}
