class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return find(grid.length-1, grid[0].length-1, grid,dp);
    }
    
    public int find(int i, int j, int[][] grid,int dp[][]) {
        int up = (int) (1e9 + 7);
        int left = (int) 1e9 + 7;
        
        if (i == 0 && j == 0) {
            return grid[0][0];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        if (i > 0) {
            up = grid[i][j] + find(i - 1, j, grid,dp);
        }
        
        if (j > 0) {
            left = grid[i][j] + find(i, j - 1, grid,dp);
        }
        
        return  dp[i][j]=Math.min(up, left);
    }
}
