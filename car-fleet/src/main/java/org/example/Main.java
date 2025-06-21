package org.example;

import java.util.Arrays;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CarFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3});
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for (int[] p : pair) {
            stack.push((double) (target - p[0]) / p[1]);
            if (stack.size() >= 2 &&
                    stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();
    }

    public static int CarFleet(int target, int[] position, int[] speed) {
        var tt = new double[target];

        for (int i = 0; i < position.length; ++i)
            tt[position[i]] = (double) (target - position[i]) / speed[i];

        int output = 0;
        double low = 0.0;
        for (int i = target - 1; i >= 0; --i) {
            if (tt[i] > low) {
                ++output;
                low = tt[i];
            }
        }

        return output;
    }

}