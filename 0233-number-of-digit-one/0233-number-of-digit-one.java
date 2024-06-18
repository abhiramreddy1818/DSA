class Solution {
    public int countDigitOne(int n) {
        int temp = n;
        int d = 10;
        int m = 1;
        int ans = 0;

        while (temp > 0) {
            int r = 0;
            if (temp % 10 > 1)
                r = m;
            
            if (temp % 10 == 1) {
                r = n % m + 1;
            }
            
            ans += (n / d) * m + r; 
            m *= 10;
            d *= 10;
            temp /= 10;
        }
        
        return ans;
    }
}
