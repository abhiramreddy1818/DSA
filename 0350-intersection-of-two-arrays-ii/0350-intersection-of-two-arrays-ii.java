class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;int j=0;
        ArrayList<Integer> a=new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int ans[]=new int[a.size()];
        for(i=0;i<a.size();i++){
            ans[i]=a.get(i);
        }
        return ans;
    }
}