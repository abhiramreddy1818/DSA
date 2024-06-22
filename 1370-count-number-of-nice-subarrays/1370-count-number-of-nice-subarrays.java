class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums, k) - find(nums, k - 1);
    }

    public int find(int[] nums, int k) { 
        int n = nums.length;
        int j = 0;
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1)
                sum += 1;

            while (sum > k) {
                sum -= nums[j] % 2;
                j++;
            }

            ans += (i - j + 1);
        }

        return ans;
    }
}
