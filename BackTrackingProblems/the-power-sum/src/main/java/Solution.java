public class Solution {


    public static void main(String[] args) {
        int[] dp = new int[1000];
        dp[1] = 1;
        System.out.println(fibonacci(7, dp));
        System.out.println(factorial(4));
        System.out.println(sumDigit(12));
        String s = "hello";
        System.out.println(revers("hello", s.length() - 1));
    }


    public static int fibonacci(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }

    public static Long factorial(int n) {
        if (n == 1) return 1L;
        if (n == 2) return 2L;
        return n * factorial(n - 1) * factorial(n - 2);
    }




    public static int sumDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigit(number / 10);
    }

    /*
        string
    string , string.length-1

            int index;
        return string(index)+(stirng,--index)
           hello
           o+f(,'hell')
     */

    public static String revers(String s, int index) {
        if (index < 0)
            return "";

        return s.charAt(index) + revers(s, --index);
    }

}
