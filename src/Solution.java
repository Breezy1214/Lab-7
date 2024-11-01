import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        System.out.println(longestConsecutive(new int[] {1, 2, 3, 4, 5}));
        System.out.println("Test Case 2:");
        System.out.println(longestConsecutive(new int[] {0}));
        System.out.println("Test Case 3:");
        System.out.println(longestConsecutive(new int[] {5, 5, 5, 5}));
        System.out.println("Test Case 4:");
        System.out.println(longestConsecutive(new int[] {0,-1, 9,-3,-2, 2, 1, 5}));
        System.out.println("Test Case 5:");
        System.out.println(longestConsecutive(new int[] {10, 20, 30, 40, 50}));
        System.out.println("Test Case 6:");
        System.out.println(longestConsecutive(new int[] {1, 9, 3, 10, 4, 20, 2}));
        System.out.println("Test Case 7:");
        System.out.println(longestConsecutive(new int[] {1, 3, 5, 2, 4, 6, 7, 9, 8, 12, 13, 10, 11}));
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








