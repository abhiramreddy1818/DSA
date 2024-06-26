import java.util.Arrays;

class Solution {
    public int minCut(String s) {
       int dp[]=new int[s.length()+1];
       int n=s.length();
       dp[n]=0;
       for(int i=n-1;i>=0;i--){
         int min=Integer.MAX_VALUE;
         for(int j=i;j<n;j++){
             if(isPalindrome(i,j,s)){
                int len=1+dp[j+1];
                min=Math.min(min,len);
             }
              
         }
         dp[i]=min;
       }
       return dp[0]-1;
    }
    
    public boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
