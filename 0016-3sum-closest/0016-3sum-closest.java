class Solution {
    public int threeSumClosest(int[] nums, int k) {
        Arrays.sort(nums);
         int n = nums.length;
         int min=Integer.MAX_VALUE;
         int ans=k;
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1;
                int l = n - 1;
                while (j < l) {
                    int sum = nums[i] + nums[j] + nums[l];
                    if (sum == k) {
                        return k;
                    } else if (sum < k) {
                        j++;
                        int t=Math.abs(sum-k);
                        if(min>t){
                             ans=sum;
                             min=t;
                        }
                        
                    } else {
                        l--;
                        int t=Math.abs(sum-k);
                        if(min>t){
                             ans=sum;
                             min=t;
                        }
                        
                    }
                }
            }
        }
        return ans;
        
    }
}
