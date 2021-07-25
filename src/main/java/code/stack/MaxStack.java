package code.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/max-stack/
 */
public class MaxStack {

    Stack<Integer> normalStack;
    Stack<Integer> maxStack;

    public MaxStack() {
        normalStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        int max = maxStack.isEmpty() || peekMax() < x ? x : peekMax();
        maxStack.push(max);
        normalStack.push(x);
    }

    public int pop() {
        maxStack.pop();
        return normalStack.pop();
    }

    public int top() {
        return normalStack.peek();

    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        Stack<Integer> dummy = new Stack<>();
        int max = peekMax();
        while (top() != max) {
            dummy.push(pop());
        }
        pop();

        while (!dummy.isEmpty()) {
            push(dummy.pop());
        }
        return max;
    }
}
