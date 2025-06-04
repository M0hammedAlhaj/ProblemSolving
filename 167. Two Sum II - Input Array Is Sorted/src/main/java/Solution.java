import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int t = target - numbers[i];
            int index =Arrays.binarySearch(numbers,i+1,numbers.length,t) ;
            if (index > -1) {
                return new int[]{i+1,index+1};
            }
            i++;
        }

        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{5,25,75}, 100)));
    }
}