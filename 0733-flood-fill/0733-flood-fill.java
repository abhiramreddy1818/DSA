class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor == color) return image;
        int [][] ans=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                ans[i][j]=image[i][j];
            }
        }
        dfs(ans,sr,sc,color,ans[sr][sc]);
        return ans;

    }
    void dfs(int ans[][],int r ,int c ,int color ,int old){
        ans[r][c]=color;
        int a[]={-1,0,1,0};
        int b[]={0 ,1,0,-1};
        for(int i=0;i<4;i++){
            int nr=r+a[i];
            int nc=c+b[i];
            if(nr>=0 && nc>=0 && nr<ans.length && nc<ans[0].length && ans[nr][nc]==old){
                dfs(ans,nr,nc,color,old);
            }
        }

    }
}