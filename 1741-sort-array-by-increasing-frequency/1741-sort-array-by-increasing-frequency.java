class Solution {
    public int[] frequencySort(int[] nums) {
     Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

    
        Integer[] Nums = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            Nums[i] = nums[i];
        }

        Arrays.sort(Nums, (a, b) -> {
            int f= Integer.compare(freq.get(a), freq.get(b));
            if (f == 0) {
                return Integer.compare(b, a); 
            }
            return f; 
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Nums[i];
        }

        return nums;
    } 
}