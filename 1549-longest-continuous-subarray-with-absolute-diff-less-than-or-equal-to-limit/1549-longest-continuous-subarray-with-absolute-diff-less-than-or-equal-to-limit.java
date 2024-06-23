import java.util.TreeMap;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < n) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while ((map.lastKey() - map.firstKey()) > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
