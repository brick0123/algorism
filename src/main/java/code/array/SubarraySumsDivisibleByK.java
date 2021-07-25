package code.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/subarray-sums-divisible-by-k/
 */
public class SubarraySumsDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum  = 0;
        int count = 0;
        for (int num : nums) {
            sum = (sum + num) % k;
            if (sum < 0) {
                sum += k;
            }
            count += map.getOrDefault(sum, 0);

            map.merge(sum, 1, Integer::sum);
        }
        return count;
    }

}
