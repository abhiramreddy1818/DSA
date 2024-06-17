class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int x[]:dp)
        Arrays.fill(x,-1);
       return solve(m-1,n-1,dp);
       
    }
    public int solve(int i ,int j,int dp[][]){
         if(i==0 && j==0)
         return 1;
        
       
        else if(i==-1 || j==-1)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
         return dp[i][j];
        else{
            return dp[i][j]=solve(i,j-1,dp)+solve(i-1,j,dp);
        }
    }
}