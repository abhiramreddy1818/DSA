class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return find(n-1, nums,dp);
    }
    public static int find(int i,int nums[],int dp[]){
        if(i<0)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int nottake=find(i-1,nums,dp);
        int take=nums[i]+find(i-2,nums,dp);
        return dp[i]=Math.max(nottake,take);
    }
}