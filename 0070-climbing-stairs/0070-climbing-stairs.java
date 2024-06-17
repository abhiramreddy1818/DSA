class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return find(n,dp);
    }
    public int find(int n,int dp[]){
        int count=0;
        if(n==0)
         return 1;
         if(dp[n]!=-1)
         return dp[n];
        if(n>=2){
           count+=find(n-2,dp)+find(n-1,dp);
        }
        else{
             count+=find(n-1,dp);
        }
        return dp[n]=count;
        
    }
}