class Solution {
    public int minHeightShelves(int[][] books, int w) {
        int dp[][]=new int[books.length+1][w+1];
        for(int x[]:dp)
            Arrays.fill(x,-1);
        return find(books, w, 0, w, 0,dp);
    }

    int find(int[][] book, int w, int i, int rw, int h,int dp[][]) {
        if (i == book.length) {
            return h;
        }
        if(dp[i][rw]!=-1)
        return dp[i][rw];
        int[] curbook = book[i];
        int max = Math.max(h, curbook[1]);

        int height1 = h + find(book, w, i + 1, w - curbook[0], curbook[1],dp);
        int height2 = Integer.MAX_VALUE;
        if (rw >= curbook[0]) {
            height2 = find(book, w, i + 1, rw - curbook[0], max,dp);
        }

        return dp[i][rw]=Math.min(height1, height2);
    }
}
