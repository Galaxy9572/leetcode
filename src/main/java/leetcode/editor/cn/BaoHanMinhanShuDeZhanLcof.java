package leetcode.editor.cn;

import org.junit.Test;

import java.util.Stack;

/**
 * 剑指 Offer 30.包含min函数的栈
 *
 * @author liaojunyao
 */
public class BaoHanMinhanShuDeZhanLcof {

    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {

        // 存放所有数据的栈
        Stack<Integer> dataStack = new Stack<>();

        // 存放最小值的栈，当后来的值比栈顶（最小值）都小时才允许入栈
        Stack<Integer> minStack = new Stack<>();

        /**
         * initialize your data structure here.
         */
        public MinStack() {

        }

        public void push(int x) {
            dataStack.push(x);
            // 当后来的值比栈顶（最小值）都小或者等于时才允许入栈，必须要写等于，不然有多个相同的最小值时，只会有一个值入栈，导致peek报空栈异常
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            if(!dataStack.isEmpty()){
                Integer pop = dataStack.pop();
                if (!minStack.isEmpty() && minStack.peek().equals(pop)) {
                    minStack.pop();
                }
            }
        }

        public int top() {
            if (!dataStack.isEmpty()) {
                return dataStack.peek();
            }
            throw new RuntimeException("Empty Stack");
        }

        public int min() {
            if (!minStack.isEmpty()) {
                return minStack.peek();
            }
            throw new RuntimeException("Empty Stack");
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */
//leetcode submit region end(Prohibit modification and deletion)
    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());

    }

}
