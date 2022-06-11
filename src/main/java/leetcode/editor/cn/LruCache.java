package leetcode.editor.cn;

import org.junit.Test;

import java.util.HashMap;

/**
 * 146.LRU 缓存
 *
 * @author liaojunyao
 */
public class LruCache {

    //leetcode submit region begin(Prohibit modification and deletion)
    class LRUCache {

        private final int capacity;
        private DoubleLinkedList chain;
        private final HashMap<Integer, Node> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>(capacity);
            chain = new DoubleLinkedList();
        }

        public int get(int key) {
            Node node = map.get(key);
            if (node == null) {
                return -1;
            }
            put(key, node.value);
            return node.value;
        }

        public void put(int key, int value) {
            Node node = new Node(key, value);
            Node existNode = map.get(key);
            if(existNode != null){
                chain.delete(existNode);
            } else {
                if(map.size() == capacity){
                    int deletedKey = chain.deleteLast();
                    map.remove(deletedKey);
                }
            }
            chain.addFirst(node);
            map.put(key, node);
        }

    class DoubleLinkedList {

        private final Node head = new Node(0, 0);
        private final Node tail = new Node(0, 0);
        public DoubleLinkedList() {
            head.next = tail;
            tail.prev = head;
        }

        /**
         * 将Node添加到链表第一个，当进行put和get操作时都将调用此方法
         *
         * @param node 节点
         */
        public void addFirst(Node node) {
            // 1、构建node的prev和next两个链条
            // 将插入的node的next指针指向原head的next元素
            node.next = head.next;
            // 将node的前一个元素指针指向head
            node.prev = head;
            // 2、将原head和head的下一元素的互指链条拆除，指向node
            head.next.prev = node;
            head.next = node;
        }

        /**
         * 删除Node
         *
         * @param node 节点
         */
        public int delete(Node node) {
            // 删除链表中的某个节点，只需拆除node的前后两条链，然后前后两个元素互相指向对方即可
            node.next.prev = node.prev;
            node.prev.next = node.next;
            return node.key;
        }

        public int deleteLast() {
            if (head.next == tail) {
                return -1;
            }
            return delete(tail.prev);
        }
    }

        /**
         * 双链表中的单个节点
         * 双链表的结构如下：head<==>Node1<==>Node2<==>...<==>tail
         *
         * @author liaojunyao
         */
        class Node {
            private int key;
            private int value;
            private Node prev;
            private Node next;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }

        }
    }

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
//leetcode submit region end(Prohibit modification and deletion)
    @Test
    public void test() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);

        lruCache.put(2, 2);

        int val = lruCache.get(1);
        System.out.println(val);

        lruCache.put(3, 3);

        val = lruCache.get(2);
        System.out.println(val);

        lruCache.put(4, 4);

        val = lruCache.get(1);
        System.out.println(val);

        val = lruCache.get(3);
        System.out.println(val);

        val = lruCache.get(4);
        System.out.println(val);
    }

}
