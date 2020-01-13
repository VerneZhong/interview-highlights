package org.zxb.leetcode.algorithm;

import java.util.*;

/**
 * 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 *
 * @author Mr.zxb
 * @date 2020-01-13 15:30
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3, 2, 3, 3}));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.computeIfPresent(num, (k, v) -> ++v);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(list.get(list.size() - 1))) {
                key = entry.getKey();
                break;
            }
        }
        return key;
    }
}
