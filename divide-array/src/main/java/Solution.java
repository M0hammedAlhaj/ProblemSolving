public class Solution {

    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }
        int[] array = new int[500];//size
        for (int num : nums) {
            array[--num] += 1;
        }
        //hashtable ->
        for (int i : array) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}
