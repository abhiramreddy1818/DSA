import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    bfs(i, j, visited, grid);
                    count++;
                }
            }
        }
        return count;
    }

    void bfs(int r, int c, boolean[][] visited, char[][] grid) {
        int[] dr = {-1, 1, 0, 0}; 
        int[] dc = {0, 0, -1, 1}; 
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(r, c));
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int cr = current.first;
            int cc = current.second;

            for (int d = 0; d < 4; d++) {
                int nr = cr + dr[d];
                int nc = cc + dc[d];

                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && !visited[nr][nc] && grid[nr][nc] == '1') {
                    visited[nr][nc] = true;
                    queue.add(new Pair(nr, nc));
                }
            }
        }
    }
}
