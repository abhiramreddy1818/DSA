class Solution {
    public int numEnclaves(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] vis = new int[m][n];
        int count = 0;

        // Run DFS for all boundary cells that are land and not visited
        for (int i = 0; i < m; i++) {
            if (vis[i][0] == 0 && board[i][0] == 1)
                dfs(i, 0, board, vis);
            if (vis[i][n - 1] == 0 && board[i][n - 1] == 1)
                dfs(i, n - 1, board, vis);
        }
        for (int i = 0; i < n; i++) {
            if (vis[0][i] == 0 && board[0][i] == 1)
                dfs(0, i, board, vis);
            if (vis[m - 1][i] == 0 && board[m - 1][i] == 1)
                dfs(m - 1, i, board, vis);
        }

        // Count the number of enclaves
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1 && vis[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int r, int c, int[][] board, int[][] vis) {
        vis[r][c] = 1;
        int[] rowDirections = {1, 0, -1, 0};
        int[] colDirections = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int newRow = r + rowDirections[i];
            int newCol = c + colDirections[i];
            if (newRow >= 0 && newCol >= 0 && newRow < board.length && newCol < board[0].length &&
                board[newRow][newCol] == 1 && vis[newRow][newCol] == 0) {
                dfs(newRow, newCol, board, vis);
            }
        }
    }
}
