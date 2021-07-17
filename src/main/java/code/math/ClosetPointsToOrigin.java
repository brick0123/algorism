package code.math;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class ClosetPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {

        int[][] result = new int[k][2];

        Map<Integer, Integer> map = new HashMap<>();

        Queue<Integer> heap = new PriorityQueue<>(
            (o1, o2) -> map.get(o1) - map.get(o2));

        for (int i = 0; i < points.length; i++) {
            int distance = distance(points[i][0], points[i][1]);

            map.put(i, distance);
        }

        heap.addAll(map.keySet());
        for (int i = 0; i < k; k++) {
            int index = heap.poll();
            result[i][0] = points[i][0];
            result[i][1] = points[i][1];
        }

        return result;
    }

    public int distance(int x, int y) {
        return (x * x) + (y * y);
    }

}
