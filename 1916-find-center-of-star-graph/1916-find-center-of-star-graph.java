class Solution {
    public int findCenter(int[][] edges) {
        int n1 = edges[0][0], n2 = edges[0][1];
        if (n1 == edges[1][0] || n1 == edges[1][1]) {
            return n1;
        }
        return n2;
    }
}
