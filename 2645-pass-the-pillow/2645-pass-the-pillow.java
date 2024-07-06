class Solution {
    public int passThePillow(int n, int time) {
         if(time<n){
            return time+1;
         }
         int rounds=time/(n-1);
         if(rounds%2==0)
         return (time%(n-1));
         else
          return (n-time%(n-1));
    }
}