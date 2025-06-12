package org.example;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c1 = stack.pop();
                if (c == '(') {
                    if (!(c + 1 == c1)) {
                        return false;
                    }
                } else {
                    if (!((c + 2) == c1)) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }
}
