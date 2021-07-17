package code;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/solution/
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> dummy = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            dummy.add(check(i));
        }

        return dummy;
    }

    private String check(final int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }

        if (i % 5 == 0) {
            return "Buzz";
        }
        return "" + i;
    }

}
