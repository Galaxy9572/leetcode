package leetcode.editor.cn;

import org.junit.Test;

import java.util.*;

/**
 * 20.有效的括号
 *
 * @author liaojunyao
 */
public class ValidParentheses {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution{
        Map<Character, Character> map = new HashMap<Character, Character>(){{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        public boolean isValid(String s) {
            if (s.length() % 2 != 0) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                // 碰到左括号入栈，碰到右括号弹栈比较与当前循环括号的对应右括号是否相同
                if(map.containsKey(c)){
                    stack.push(c);
                } else {
                    if(stack.isEmpty() || !map.get(stack.pop()).equals(c)){
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    @Test
    public void test() {
        Solution solution = new Solution();
//        boolean valid = solution.isValid("{[]}");
//        System.out.println(valid);
//
//        valid = solution.isValid("{{{{");
//        System.out.println(valid);
//
//        valid = solution.isValid("()[]{}");
//        System.out.println(valid);
//
//        valid = solution.isValid("(([]){})");
//        System.out.println(valid);

        boolean valid = solution.isValid("([}}])");
        System.out.println(valid);
    }

}
