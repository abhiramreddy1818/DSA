class Solution {
    public int findmin(int nums[]){
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }
        return min;
    }
    public int findmax(int nums[]){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        return max;
    }
    public boolean check(int bloom[],int m ,int k ,int mid ){
        int n=bloom.length;
        int count=0;
        int boq=0;
        for(int i=0;i<n;i++){
            if(bloom[i]<=mid){
                count++;
            }
            else{
                boq+=(count/k);
                count=0;
            }
        }
        boq+=(count/k);
        return boq>=m;
    }

    public int minDays(int[] bloom, int m, int k) {
        if(bloom.length<m*k)
        return -1;
        int low=findmin(bloom);
        int high=findmax(bloom);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(bloom ,m , k ,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}