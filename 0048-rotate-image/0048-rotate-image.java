class Solution {
    public void rotate(int[][] nums) {
        int n = nums.length;
        
    
        for (int i = 0; i < n / 2; i++) {
            swap(nums, i, n - i - 1);
        }
        
    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }
    
    void swap(int[][] nums, int p, int q) {
        for (int i = 0; i < nums[p].length; i++) {
            int temp = nums[p][i];
            nums[p][i] = nums[q][i];
            nums[q][i] = temp;
        }
    }
    
   
}
