package code.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int result = 1;

        int sum = 1;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i + 1] != nums[i]) {
                if (nums[i + 1] == nums[i] + 1) {
                    sum++;
                } else {
                    sum = 1;
                }
            }
            result = Math.max(result, sum);
        }

        return result;
    }
}
