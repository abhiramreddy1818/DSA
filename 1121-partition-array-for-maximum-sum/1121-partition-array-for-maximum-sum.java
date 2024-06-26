class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return find(arr,0,arr.length,k,dp);
    }
    public int find(int arr[],int i,int n,int k,int dp[]){
        if(i==n)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int min=Integer.MIN_VALUE;

        int max=Integer.MIN_VALUE;
        for(int j=i;j<i+k && j<n;j++){
            max=Math.max(max,arr[j]);
            int ans=(j-i+1)*max+find(arr,j+1,n,k,dp);
            min=Math.max(ans,min);
        }
        return dp[i]=min;
    }
}