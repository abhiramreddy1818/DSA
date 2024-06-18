class Solution {
    public int countDigitOne(int n) {
       int d=10;
       int m=1;
       int ans=0;
       int temp=n;
       while(temp>0){
         ans+=(n/d)*m+Math.min(Math.max(n%d-m+1,0),m);
         d=d*10;
         m=m*10;
         temp/=10;
       }
       return ans;
    }
}