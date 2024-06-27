class Solution {
    public boolean stoneGame(int[] nums) {
        int n = nums.length;
        boolean[][] dp = new boolean[n][n];
        
        // If there's only one stone, the starting player wins by picking it.
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = (nums[i] + sum(nums, i + 1, j) > sum(nums, i, j - 1)) ||
                           (nums[j] + sum(nums, i, j - 1) > sum(nums, i + 1, j));
            }
        }
        
        return dp[0][n - 1];
    }

    private int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
