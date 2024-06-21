import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

  
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
           
            if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < start) {
                ans.add(Arrays.asList(start, end));
            } else {
               
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }
        
       
        int[][] a = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            a[i][0] = ans.get(i).get(0);
            a[i][1] = ans.get(i).get(1);
        }
        
        return a;
    }
}
