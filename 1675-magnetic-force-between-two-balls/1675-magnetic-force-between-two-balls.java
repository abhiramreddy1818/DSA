class Solution {
    public boolean check(int[] position, int mid, int m) {
        int n = position.length;
        int prev = position[0];
        int count = 1; 
        for (int i = 1; i < n; i++) {
            if (position[i] - prev >= mid) {
                count++;
                prev = position[i];
                if (count >= m) {
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1; 
        int high = position[n - 1] - position[0]; 
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (check(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}