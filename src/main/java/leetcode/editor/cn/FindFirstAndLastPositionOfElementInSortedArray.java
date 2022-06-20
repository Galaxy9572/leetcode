package leetcode.editor.cn;

import org.junit.Test;

/**
 * ★
 * 34.在排序数组中查找元素的第一个和最后一个位置
 *
 * @author liaojunyao
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return new int[]{-1, -1};
            }
            int i = 0, j = nums.length - 1;
            // 搜索左边界
            while (i < j) {
                // 为了防止数据溢出而不写成(i + j) / 2
                int mid = i + (j - i) / 2;
                if (nums[mid] >= target) {
                    j = mid;
                } else {
                    i = mid + 1;
                }
            }
            // 左边界
            int l = i;
            if (nums[j] != target) {
                return new int[]{-1, -1};
            }
            i = 0;
            j = nums.length - 1;
            // 搜索右边界
            while (i < j) {
                // 为了防止数据溢出而不写成(i + j) / 2
                int mid = i + (j - i + 1) / 2;
                if (nums[mid] <= target) {
                    // target大于等于nums[mid]，说明右边界还在更右边，i要向右移
                    i = mid;
                } else {
                    j = mid - 1;
                }
            }
            int r = j;
            return new int[] {l, r};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    @Test
    public void test() {

    }

}
