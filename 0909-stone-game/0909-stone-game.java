class Solution {
    public boolean stoneGame(int[] nums) {
        int n = nums.length;
        Boolean dp[][]=new Boolean [n][n];
        return find(0, n - 1, nums, 0, 0, true,dp);
    }
    
    public boolean find(int i, int j, int nums[], int a, int b, boolean flag,Boolean  dp[][]) {
        if (i > j) {
            return a > b;
        }
        
        boolean pickStart = false;
        boolean pickEnd = false;
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if (flag) {
            pickStart = find(i + 1, j, nums, a + nums[i], b, !flag,dp);
            pickEnd = find(i, j - 1, nums, a + nums[j], b, !flag,dp);
        } else {
            pickStart = find(i + 1, j, nums, a, b + nums[i], !flag,dp);
            pickEnd = find(i, j - 1, nums, a, b + nums[j], !flag,dp);
        }
        
        return dp[i][j]=pickStart || pickEnd;
    }
}
