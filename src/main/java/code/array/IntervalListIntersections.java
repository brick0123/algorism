package code.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/interval-list-intersections/submissions/
 */
public class IntervalListIntersections {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;

        List<int[]> list = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {

            int left = Math.max(firstList[i][0], secondList[j][0]);
            int right = Math.min(firstList[i][1], secondList[j][1]);

            if (left <= right) {
                list.add(new int[]{left, right});
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }

}
