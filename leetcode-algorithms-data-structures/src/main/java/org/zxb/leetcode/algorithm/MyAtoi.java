package org.zxb.leetcode.algorithm;

/**
 * 字符串转换整数
 *
 * @author Mr.zxb
 * @date 2020-01-13 14:04
 */
public class MyAtoi {

    public static void main(String[] args) {
//        System.out.println(myAtoi("4193 with words"));
//        System.out.println(myAtoi("+12"));
//        System.out.println(myAtoi("   -12"));
//        System.out.println(myAtoi(" 2  -12"));
//        System.out.println(myAtoi(" ##2  -12"));
//        System.out.println(myAtoi("-"));
//        System.out.println(myAtoi("-91283472332"));
//        System.out.println(myAtoi("3.114"));
//        System.out.println(myAtoi("+-3"));
        System.out.println(myAtoi("  -0012a42"));
    }

    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        boolean negative = false;
        int x = 0, y = 0;
        for (int i = 0; i < chars.length; i++) {
            Character aChar = chars[i];
            // 首字符是字母，返回0
            if (Character.isWhitespace(aChar)) {
                x++;
                continue;
            }
            if (aChar.equals('.')) {
                break;
            }
            if (x == 0 && !Character.isDigit(aChar)) {
                if (aChar.equals('+')) {
                    y++;
                }
                if (aChar.equals('-')) {
                    y++;
                }
                if ((!aChar.equals('-') && !aChar.equals('+')) || y > 1) {
                    return 0;
                }
                break;
            }
            if (Character.isDigit(aChar)) {
                sb.append(aChar);
            }
            if (aChar.equals('-')) {
                negative = true;
            }
        }
        int anInt;
        String s1 = sb.toString().length() > 0 ? sb.toString() : "0";
        if (negative) {
            String s = s1;
            try {
                anInt = Integer.parseInt("-" + s);
            } catch (NumberFormatException e) {
                anInt = Integer.MIN_VALUE;
            }
        } else {
            try {
                anInt = Integer.parseInt(s1);
            } catch (NumberFormatException e) {
                anInt = Integer.MAX_VALUE;
            }
        }
        return anInt;
    }
    
}
