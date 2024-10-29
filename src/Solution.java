import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : nums) {

            if (!set.contains(num - 1)) {
                int cur = num;
                int curMax = 1;

                while (set.contains(cur + 1)) {
                    cur++;
                    curMax++;
                }

                max = Math.max(max, curMax);
            }
        }

        return max;
    }
}








