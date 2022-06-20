package leetcode.editor.cn;

import org.junit.Test;

/**
 * 剑指 Offer 05.替换空格
 *
 * @author liaojunyao
 */
public class TiHuanKongGeLcof {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {
            if(s == null || s.length() == 0){
                return s;
            }
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    sb.append("%20");
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    @Test
    public void test() {

    }

}
