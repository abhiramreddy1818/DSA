class Solution {
    public int findMinDifference(List<String> time) {
        int n=time.size();
        int minutes [] = new int[n];
        for(int i = 0 ; i < n ; i++){
         int h = Integer.parseInt(time.get(i).substring(0, 2));
         int m = Integer.parseInt(time.get(i).substring(3));

            minutes[i] = h * 60 + m;

        }
        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < n ;i++){
            min=Math.min(min , minutes[i]-minutes[i-1]);
        }

       return Math.min(min, 24 * 60 - minutes[minutes.length - 1] + minutes[0]);
    }
}