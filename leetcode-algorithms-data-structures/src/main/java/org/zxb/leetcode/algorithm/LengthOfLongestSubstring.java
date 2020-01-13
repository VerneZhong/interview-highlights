package org.zxb.leetcode.algorithm;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 *
 * @author Mr.zxb
 * @date 2020-01-12 17:44
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        String str = "abc Ad1efg";

        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            // 是否是一个空格
            System.out.println("是否空格: " + Character.isWhitespace(charAt));
            // 是否是一个数字
            System.out.println("是否数字: " + Character.isDigit(charAt));
            // 是否是一个字母
            System.out.println("是否字母: " + Character.isLetter(charAt));
            // 是否是大写字母
            System.out.println("是否字母: " + Character.isUpperCase(charAt));
            // 是否是小写字母
            System.out.println("是否字母: " + Character.isLowerCase(charAt));
        }

//        System.out.println(str.charAt(0));
//        System.out.println(str.toCharArray());

        char[] chars = new char[]{'a', 'b', 'c', '4', '5'};

//        System.out.println(chars);

//        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set<Character> characters = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < length && j < length) {
            // set 不存在 char 字符
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                characters.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
