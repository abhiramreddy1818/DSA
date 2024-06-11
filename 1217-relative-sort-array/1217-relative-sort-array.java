class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
     
        int n2=arr2.length;
        int count[]=new int[1001];
        for(int i=0;i<n;i++){
            count[arr1[i]]++;
        }
        int k=0;
        for(int i=0;i<n2;i++){
            int c=count[arr2[i]];
            
            for(int j=0;j<c;j++){
                arr1[k++]=arr2[i];
            }
            count[arr2[i]]=0;
        }
        for(int i=0;i<1001;i++){
            int c=count[i];
            for(int j=0;j<c;j++){
                arr1[k++]=i;
            }
        }
        return arr1;
    }
}