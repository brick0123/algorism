package code.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/asteroid-collision/
 */
public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int num : asteroids) {
            if (stack.isEmpty() || num > 0) {
                stack.push(num);
            } else {
                // 5 <= -5
                // 6 < -3
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -num) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(num);
                }

                if (stack.peek() == -num) {
                    stack.pop();
                }

            }
        }

        int[] arr = new int[stack.size()];

        int i = arr.length -1;
        while (!stack.isEmpty()) {
            arr[i--] = stack.pop();
        }
        return arr;
    }
}
