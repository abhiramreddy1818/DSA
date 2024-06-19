class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int dp[][]=new int[n][n];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return find(t,0,0,dp);
    }
    public int find(List<List<Integer>> t ,int i ,int j,int dp[][]){
        int n=t.size();
        int m=t.get(0).size();
        
        if(i==n-1){
            return t.get(i).get(j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int  diagonal=t.get(i).get(j)+find(t,i+1,j+1,dp);
        int down=t.get(i).get(j)+find(t,i+1,j,dp);
        
        return dp[i][j]=Math.min(diagonal,down);
         
    
    }
}