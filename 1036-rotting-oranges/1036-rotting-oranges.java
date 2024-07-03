class Pair {
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int count = 0;
        Queue<Pair> queue = new LinkedList<>();
        int freshOranges = 0;
        
        // Initialize the queue with all initially rotten oranges
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        // Directions for moving in the grid (up, right, down, left)
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();
                int r = p.first;
                int c = p.second;
                
                for (int j = 0; j < 4; j++) {
                    int row = r + dRow[j];
                    int col = c + dCol[j];
                    if (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] == 1) {
                        grid[row][col] = 2;
                        queue.add(new Pair(row, col));
                        freshOranges--;
                    }
                }
            }
            count++;
        }

        
        return freshOranges == 0 ? count : -1;
    }
}
