import java.util.Arrays;

class Solution {
    public int findKthNumber(int n, int k) {
        String ans[] = new String[n];
        for(int i = 1; i <= n; i++) {
            ans[i - 1] = String.valueOf(i);
        } 
        Arrays.sort(ans);
        return Integer.parseInt(ans[k - 1]);
    }
}
