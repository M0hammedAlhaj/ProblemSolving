import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public static void main(String[] args) {
        allPossibleCharacter("", new char[]{'a', 'b'}, 2);
    }


    public static int fub(int n) {
        if (n == 1) {
            return 1;
        }
        return n + fub(n - 1);
    }

    public static void recu(String s, int sum, int sum2, int n) {
        if (s.length() == n * 2) {
            if (sum == sum2) System.out.println(s);
            return;
        }
        recu(s + '0', sum, sum2, n);
        if (s.length() < n) {
            recu(s + '1', sum + 1, sum2, n);
        } else {
            recu(s + '1', sum, sum2 + 1, n);
        }
    }

    public static void allPossibleCharacter(String currentWork, char[] input, int k) {
        if (currentWork.length() == k) {
            System.out.println(currentWork);
            return;
        }
        for (int i = 0; i < input.length; i++) {
            allPossibleCharacter(currentWork + input[i], input, k);
        }
    }
}
