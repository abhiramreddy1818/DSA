import java.util.Arrays;

class Solution {

    private int binarySearch(int x, int[][] jobs) {
        int low = 0, high = jobs.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (jobs[mid][0] <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high; // Return the index of the largest difficulty <= x
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2]; // Store difficulty and corresponding profit
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]); // Sort jobs by difficulty
        
        // Compute maximum profits for each job up to the current index
        for (int i = 1; i < n; i++) {
            jobs[i][1] = Math.max(jobs[i][1], jobs[i - 1][1]);
        }
        
        int totalProfit = 0;
        
        // Process each worker and calculate the total profit
        for (int cap : worker) {
            int idx = binarySearch(cap, jobs); // Find the index of the largest difficulty <= current worker's capacity
            if (idx >= 0) {
                totalProfit += jobs[idx][1]; // Add the maximum profit achievable for this worker
            }
        }
        
        return totalProfit;
    }
}
