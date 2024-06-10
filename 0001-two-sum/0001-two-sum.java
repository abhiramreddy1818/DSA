class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]={-1,-1};
        HashMap <Integer ,Integer >map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int sumr=target-num;
            if(map.containsKey(sumr))
            {
                a[0]=map.get(sumr);
                a[1]=i;
                return a;

            }
            else
            {
                map.put(nums[i],i);
            }
            
        }
        return a;
    }
}