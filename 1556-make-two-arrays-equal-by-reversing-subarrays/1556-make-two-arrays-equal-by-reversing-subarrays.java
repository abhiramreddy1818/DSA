class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n=arr.length;
        int count[]=new int[1001];
        for(int i=0;i<n;i++){
            count[target[i]]++;
            count[arr[i]]--;
        }
        for(int i=0;i<1001;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}