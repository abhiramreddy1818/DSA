import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

class Solution {
    public int findMinDifference(List<String> list) {
        int n = list.size();
        if (n == 0) {
            return 0;
        }

        Collections.sort(list);
        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            int minutesDifference = calculateMinuteDifference(list.get(i), list.get(i - 1));
            minDifference = Math.min(minDifference, minutesDifference);
        }

        int circularDifference = calculateMinuteDifference(list.get(n - 1), list.get(0));
        minDifference = Math.min(minDifference, circularDifference);

        return minDifference;
    }

    public static int calculateMinuteDifference(String time1, String time2) {
        LocalTime t1 = LocalTime.parse(time1);
        LocalTime t2 = LocalTime.parse(time2);
        long minutesDifference = Math.abs(ChronoUnit.MINUTES.between(t1, t2));
        return Math.min((int) minutesDifference, 1440 - (int) minutesDifference);
    }
}
