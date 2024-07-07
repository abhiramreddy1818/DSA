class Solution {
    public int numWaterBottles(int b, int n) {
      int ans=0;
      int e=0;
      if(e+b<n)
      return b;
      while(e+b>=n){ // 9>=3  3
        ans+=b;  // 9   12
        e+=b;   //  9    3
        b=0;
        if(e>=n){   //  9>3  3
            b=e/n;  //   3    1
            e=e%n;  //   0   
        }
      }
      
      return ans+b;
    }
}