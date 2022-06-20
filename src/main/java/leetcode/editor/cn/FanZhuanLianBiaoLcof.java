package leetcode.editor.cn;

import org.junit.Test;

import java.util.Stack;

/**
 * 剑指 Offer 24.反转链表
 *
 * @author liaojunyao
 */
public class FanZhuanLianBiaoLcof {

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
        public ListNode reverseList(ListNode head) {
            if(head == null){
                return null;
            }
            // prev表示某个节点的上一个节点，上一个节点即代表链表翻转后的next节点
            ListNode prev = null;
            // 节点从head开始往后遍历
            ListNode cur = head;
            while (cur != null) {
                // 把当前节点的下一个节点先保存起来，方便下个循环指向它
                ListNode temp = cur.next;
                // 翻转指向
                cur.next = prev;
                // 翻转后prev后移一个节点
                prev = cur;
                // cur也跟着后移
                cur = temp;
            }
            return prev;

//            // 使用栈先入后出的特性，可以反向打印链表的值
//            Stack<ListNode> stack = new Stack<>();
//            while (head != null) {
//                stack.push(new ListNode(head.val));
//                head = head.next;
//            }
//            ListNode reversedHead = stack.pop();
//            ListNode cur = reversedHead;
//            while (!stack.isEmpty() && cur != null) {
//                cur.next = stack.pop();
//                cur = cur.next;
//            }
//            return reversedHead;
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
        ListNode head = solution.reverseList(node1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
