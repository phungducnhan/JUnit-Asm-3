public class ReverseInteger {

    /**
     * Reverses the input integer.
     * Time complexity: O(d)
     * where,
     * d = number of digits in num
     * <p>
     * Runtime: <a href="https://leetcode.com/submissions/detail/232679205/">1 ms</a>.
     *
     * @param num an integer.
     * @return the reverse of {@code num}.
     */
    public static int reverse(int num) {
        long reverse = 0;
        int pop;

        while (num != 0) {
            pop = num % 10;
            num = num / 10;
            reverse = reverse * 10 + pop;
        }

        return reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE ? 0 : (int) reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(0));
        System.out.println(reverse(-0));
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(Integer.MAX_VALUE));
        System.out.println(reverse(Integer.MIN_VALUE));
    }
}