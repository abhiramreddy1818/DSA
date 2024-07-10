class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(String str: logs){
            if(str.equals("../"))
           ans=Math.max(0 ,ans-1);
            else if(!str.equals("./"))
             ans=ans+1;

        }
        return ans;
    }
}