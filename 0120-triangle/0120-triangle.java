class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int dp[][]=new int[n][n];
        for(int j=0;j<n;j++){
            dp[n-1][j]=t.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int  diagonal=t.get(i).get(j)+dp[i+1][j+1];
                int down=t.get(i).get(j)+dp[i+1][j];
                dp[i][j]=Math.min(diagonal,down);
            }
        }
        return dp[0][0];
    }

}