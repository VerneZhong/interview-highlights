package org.zxb.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * @author Mr.zxb
 * @date 2020-01-13 15:17
 */
public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2 , 2, 1}));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            if (!sets.contains(num)) {
                sets.add(num);
            } else {
                sets.remove(num);
            }
        }
        return sets.toArray(new Integer[0])[0];
    }
}
