public class Solution {

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        String x = "a";
        System.out.println(isPalindrome(x, "", x.length() - 1));

        System.out.println(isPlainsmenV2(x, 0, x.length() - 1));
    }

    public static double power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * power(n, p - 1) * 1.0;
    }

    public static boolean isPalindrome(String word,String reverse ,int index) {
        if (index < 0) {
            return word.equals(reverse);
        }
        reverse += word.charAt(index);
        return isPalindrome(word, reverse, --index);
    }

    public static boolean isPlainsmenV2(String word, int left, int right) {
        if (left>=right)
            return true;

        if (word.charAt(left)!=word.charAt(right))
            return false;

        return isPlainsmenV2(word, ++left, --right);
    }
}

