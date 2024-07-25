class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        if(low<=high){
            mergesort(nums,low ,high);
        }
        return nums;

    }
    public void mergesort(int nums[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergesort(nums,low ,mid);
            mergesort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }

    }
    public void merge(int nums[],int low,int mid,int high){
       
        int l[]=new int[mid-low+1];
        int r[]=new int[high-mid];
        for(int i=0;i<l.length;i++){
            l[i]=nums[i+low];
        }
        for(int i=0;i<r.length;i++){
            r[i]=nums[i+mid+1];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<l.length && j< r.length){
            if(l[i]<=r[j]){
                nums[k++]=l[i++];
            }
            else{
                nums[k++]=r[j++];
            }
        }
        while(i<l.length){
             nums[k++]=l[i++];
        }
        while(j<r.length){
            nums[k++]=r[j++];
        }
    }
}