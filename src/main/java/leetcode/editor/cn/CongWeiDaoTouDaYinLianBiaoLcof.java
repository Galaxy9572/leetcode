package leetcode.editor.cn;

import org.junit.Test;

import java.util.Stack;

/**
 * 剑指 Offer 06.从尾到头打印链表
 *
 * @author liaojunyao
 */
public class CongWeiDaoTouDaYinLianBiaoLcof {

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {

        public int[] reversePrint(ListNode head) {
            if(head == null){
                return new int[]{};
            }
            // 使用栈先入后出的特性，可以反向打印链表的值
            Stack<Integer> stack = new Stack<>();
            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }
            int size = stack.size();
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = stack.pop();
            }
            return nums;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

    class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        int[] ints = solution.reversePrint(node1);
        for (int i : ints) {
            System.out.println(i);
        }

    }

}
