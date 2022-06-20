package leetcode.editor.cn;

import org.junit.Test;

/**
 * 剑指 Offer 53 - I.在排序数组中查找数字 I
 *
 * @author liaojunyao
 */
public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            if(nums == null || nums.length == 0){
                return 0;
            }
            int i = 0, j = nums.length - 1;
            while (true) {
                if(nums[i] != target){
                    i++;
                }
                if(nums[j] != target){
                    j--;
                }
                if(i > j){
                    return 0;
                }
                if(nums[i] == target && nums[j] == target){
                    return j - i + 1;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    @Test
    public void test() {
        int search = new Solution().search(new int[]{1}, 0);
        System.out.println(search);
    }

}
