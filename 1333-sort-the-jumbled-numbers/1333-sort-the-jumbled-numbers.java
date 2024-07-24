import java.util.*;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        List<Map.Entry<Integer, Integer>> pairedList = new ArrayList<>();
        for (int num : nums) {
            int mappedNum = mapNumber(num, mapping);
            pairedList.add(new AbstractMap.SimpleEntry<>(mappedNum, num));
        }
        pairedList.sort(Map.Entry.comparingByKey());
        int[] sortedNums = new int[n];
        for (int i = 0; i < pairedList.size(); i++) {
            sortedNums[i] = pairedList.get(i).getValue();
        }
        return sortedNums;
    }

    private int mapNumber(int num, int[] mapping) {
        if (num == 0) return mapping[0];
        int mappedNum = 0;
        int factor = 1;
        while (num > 0) {
            int digit = num % 10;
            mappedNum += mapping[digit] * factor;
            factor *= 10;
            num /= 10;
        }
        return mappedNum;
    }
}
