package org.zxb.leetcode.algorithm;

/**
 * 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *
 * @author Mr.zxb
 * @date 2020-01-13 09:34
 */
public class IntReverse {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(reverseAsOfficial(1234567899));
        System.out.println("cost time: " + (System.currentTimeMillis() - start));
    }

    /**
     * 垃圾实现
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        char[] newChar = new char[chars.length];
        int j = 0;
        boolean negative = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            Character aChar = chars[i];
            if (Character.isDigit(aChar)) {
                newChar[j++] = aChar;
            } else {
                negative = true;
            }
        }
        chars = new char[j];
        for (int i = 0; i < (negative ? newChar.length - 1 : newChar.length); i++) {
            chars[i] = newChar[i];
        }

        int anInt = 0;
        try {
            anInt = Integer.parseInt(String.valueOf(chars));
            if (negative) {
                char[] array = String.valueOf(anInt).toCharArray();
                String s = "-" + String.valueOf(array);
                anInt = Integer.parseInt(s);
            }
        } catch (NumberFormatException e) {

        }
        return anInt;
    }


    public static int reverse2(int x) {
        int ans = 0;
        while (x != 0) {
            // 溢出情况
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }

    public static int reverseAsOfficial(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = pop + rev * 10;
        }
        return rev;
    }
}
