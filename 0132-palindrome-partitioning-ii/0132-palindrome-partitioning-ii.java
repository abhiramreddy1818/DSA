class Solution {
    public int minCut(String s) {
       int dp[]=new int[s.length()];
       Arrays.fill(dp,-1);
       return  find(s,0,s.length(),dp)-1;
    }
    public int find(String s, int i ,int n,int dp[]){
        if(i==n)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
   
        int min=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            
           
            if(isPalindrome(i,j,s)){
            int len=1+find(s,j+1,n,dp);
             min=Math.min(min,len);
            }
             
        }
        return dp[i]=min;
    }
    public boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }}