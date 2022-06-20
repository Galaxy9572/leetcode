package leetcode.editor.cn;

import org.junit.Test;

import java.util.HashSet;

/**
 * 剑指 Offer 03.数组中重复的数字
 *
 * @author liaojunyao
 */
public class ShuZuZhongZhongFuDeShuZiLcof {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findRepeatNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int res = 0;
            for (int num : nums) {
                if(set.contains(num)){
                    res = num;
                    break;
                }else {
                    set.add(num);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    @Test
    public void test() {

    }

}
