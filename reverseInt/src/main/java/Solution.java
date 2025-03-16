import static java.lang.Integer.*;

class Solution {

    public static int reverse(int x) {

        StringBuilder s;
        boolean isNegative = x < 0;
        Long r;
        if (isNegative) {
            if (Long.parseLong(String.valueOf(x)) * -1 > MAX_VALUE) {
                return 0;
            }
            x *= -1;
            s = new StringBuilder(String.valueOf(x));
            s.reverse();
            r = Long.parseLong(s.toString()) * -1;
            return r < MIN_VALUE ? 0 : parseInt(s.toString()) * -1;
        }
        s = new StringBuilder(String.valueOf(x));
        s.reverse();
        r = Long.parseLong(s.toString());
        return r > MAX_VALUE ? 0 : parseInt(s.toString());
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
        System.out.println(reverse(-652));
        System.out.println(reverse(0));
        System.out.println(reverse(12));


    }
}