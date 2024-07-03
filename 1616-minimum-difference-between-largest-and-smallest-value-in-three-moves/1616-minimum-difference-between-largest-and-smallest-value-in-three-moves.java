import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
      
        if (n < 5) {
            return 0;
        }
        
        int min= Integer.MAX_VALUE;
    
        for (int i = 0; i <= 3; i++) {
            min = Math.min(min, nums[n - 1 - i] - nums[3 - i]);
        }
        
        return min;
    }
    
    
}
