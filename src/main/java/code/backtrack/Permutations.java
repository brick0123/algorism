package code.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

  public static void test(int i) {
    System.out.println("i = " + i);
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> dummy = new ArrayList<>();
    backtrack(nums, result, dummy);
    return result;
  }

  public void backtrack (int[] nums, List<List<Integer>> result, List<Integer> dummy) {
    if (dummy.size() == nums.length) {
      result.add(new ArrayList<>(dummy));
      return;
    }

    for (int num : nums) {
      if (dummy.contains(num)) {
        continue;
      }
      dummy.add(num);
      backtrack(nums, result, dummy);
      dummy.remove(dummy.size() - 1);
    }
  }

}
