package leetcode.editor.cn;

import org.junit.Test;

/**
 * 剑指 Offer 58 - II.左旋转字符串
 *
 * @author liaojunyao
 */
public class ZuoXuanZhuanZiFuChuanLcof {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseLeftWords(String s, int n) {
            if(s == null || s.length() == 0){
                return s;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = n; i < n + s.length(); i++) {
                sb.append(s.charAt(i % s.length()));
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    @Test
    public void test() {

    }

}
