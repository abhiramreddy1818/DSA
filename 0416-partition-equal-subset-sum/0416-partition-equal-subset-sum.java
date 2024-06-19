class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2==1)
        return false;
        Boolean dp[][]=new Boolean[n+1][sum+1];
        return find(n-1,nums,sum/2,dp);
    }
    public boolean find(int i,int []nums,int sum,Boolean dp[][]){
        if(sum==0)
        return true;
        if(i==0){
            return sum==nums[0];
        }
        if(dp[i][sum] !=null)
        return dp[i][sum];
        boolean pick=false;
        if(sum>=nums[i])
        pick=find(i-1,nums,sum-nums[i],dp);
        boolean not=find(i-1,nums,sum,dp);
        return dp[i][sum]=not | pick ;
    }
}