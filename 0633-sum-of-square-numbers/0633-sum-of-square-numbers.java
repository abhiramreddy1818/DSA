class Solution {
    public boolean judgeSquareSum(int c) {
        long low=0;
        long  high=(int)Math.sqrt(c);
        while(low<=high){
            if(low*low+high*high==c)
                return true;
            else if(low*low+high*high>c)
            {
                high--;
            }
            else{
                low++;
            }            
        }
        return false;
    }
}