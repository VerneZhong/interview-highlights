package org.zxb.leetcode.algorithm;

/**
 * 搜索二维矩阵 II
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 *
 * 给定 target = 20，返回 false。
 * @author Mr.zxb
 * @date 2020-01-13 16:02
 */
public class SearchMatrix {

    public static void main(String[] args) {

    }

    /**
     * 垃圾实现
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchMatrixEfficient(int[][] matrix, int target) {
        int row = matrix.length;
        if (0 == row) {
            return false;
        }

        int col = matrix[0].length;
        // 从左下角开始搜索，先从左到右，再从下到上
        int i = row - 1;

        int j = 0;
        while (i >= 0) {
            while (j < col && matrix[i][j] < target) {
                j++;
            }
            while (j < col && matrix[i][j] == target) {
                return true;
            }
            i--;
        }
        return false;
    }
}
