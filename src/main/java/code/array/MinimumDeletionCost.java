package code.array;

public class MinimumDeletionCost {

    public int minCost(String s, int[] cost) {

        int result = 0;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < cost.length; i++) {
            if (i > 0 && s.charAt(i) != s.charAt(i - 1)) {
                result += sum - max;
                sum = 0;
                max = 0;
            }
            sum += cost[i];
            max = Math.max(max, cost[i]);
        }
        result += sum - max;
        return result;
    }

}

/**
 *     public int minCost(String s, int[] cost) {
 *         int res = 0,
 *         int max_cost = 0,
 *         int sum_cost = 0,
 *         int n = s.length();
 *
 *         for (int i = 0; i < n; ++i) {
 *             if (i > 0 && s.charAt(i) != s.charAt(i - 1)) {
 *                 res += sum_cost - max_cost;
 *                 sum_cost = max_cost = 0;
 *             }
 *             sum_cost += cost[i];
 *             max_cost = Math.max(max_cost, cost[i]);
 *         }
 *         res += sum_cost - max_cost;
 *         return res;
 *     }
 */
