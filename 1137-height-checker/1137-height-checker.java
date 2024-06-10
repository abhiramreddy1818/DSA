class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count[]=new int[101];
        for(int i=0;i<n;i++){
            count[heights[i]]++;
        }
        int expected[]=new int[n];
        int k=0;
        for(int i=0;i<101;i++){
            int c=count[i];
            for(int j=0;j<c;j++){
                expected[k++]=i;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i])
            ans++;
        }
        return ans;
    }
}