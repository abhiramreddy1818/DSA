class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans=0;
        int n=isConnected.length;
        int count=0;
        boolean vis[]=new boolean[n]; // Corrected the size of the visited array
        Arrays.fill(vis,false);
        for(int i=0;i<n;i++){ // Corrected the start index to 0 and loop condition to < n
            if(vis[i]==false){
                count++;
                dfs(i,vis,isConnected);
            }
        }
        return count;
    }
    void dfs(int i,boolean vis[],int [][]graph){
        vis[i]=true;
        for(int j=0;j<graph.length;j++){
            if(vis[j]==false && graph[i][j]==1){
                dfs(j,vis,graph);
            }
        }
    }
}
