class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int vis[][]= new int[m][n];

        for(int i=0;i<m;i++){
            if(vis[i][0]==0 && board[i][0]=='O')
             dfs(i,0,board,vis);
            if(vis[i][n-1]==0 && board[i][n-1]=='O')
             dfs(i,n-1,board,vis);
        }
        for(int i=0;i<n;i++){
             if(vis[0][i]==0 && board[0][i]=='O')
             dfs(0,i,board,vis);
            if(vis[m-1][i]==0 && board[m-1][i]=='O')
             dfs(m-1,i,board,vis);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && vis[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
       
        
    }
    public void dfs(int r ,int c ,char board[][],int vis[][]){
            vis[r][c]=1;
            int nr[]={1,0,-1,0};
            int cr[]={0,1,0,-1};
            for(int i=0;i<4;i++){
                int nrow=r+nr[i];
                int ncol=c+cr[i];
                if(nrow>=0 && ncol>=0 && nrow<board.length && ncol < board[0].length && board[nrow][ncol]=='O' && vis[nrow][ncol]==0){
                    dfs(nrow,ncol ,board,vis);
                }
            }
        }
}