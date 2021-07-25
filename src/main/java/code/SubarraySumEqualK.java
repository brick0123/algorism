package code;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
public class SubarraySumEqualK {

    public static void main(String[] args) {
        subarraySum(new int[]{1, 1, 5, 1, 1}, 2);
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.merge(sum, 1, Integer::sum);
        }

        return count;
    }


}
