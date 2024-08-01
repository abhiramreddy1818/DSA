class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (detail.length() >= 13) {
                int age = Integer.parseInt(detail.substring(11, 13));
                if (age > 60) {
                    count++;
                }
            }
        }
        return count;
    }
}
