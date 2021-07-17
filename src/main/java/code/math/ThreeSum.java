package code.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();


        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                threeSum(nums, i, list);
            }
        }
        return list;
    }

    private void threeSum(int[] nums, int i, List<List<Integer>> list) {
        int left = i + 1;
        int right = nums.length-1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum < 0) {
                left++;
            }

            if (sum > 0) {
                right--;
            }

            if (sum == 0) {
                list.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                left++;
                right--;

                while (left < right && nums[left] == nums[left -1]) {
                    left++;
                }
            }
        }
    }

}
