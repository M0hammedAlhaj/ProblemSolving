package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public class Solution {
        public int characterReplacement(String s, int k) {
            HashMap<Character, Integer> count = new HashMap<>();
            int res = 0;

            int l = 0, maxf = 0;
            for (int r = 0; r < s.length(); r++) {
                count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
                maxf = Math.max(maxf, count.get(s.charAt(r)));

                while ((r - l + 1) - maxf > k) {
                    count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                    l++;
                }
                res = Math.max(res, r - l + 1);
            }

            return res;
        }
    }

}