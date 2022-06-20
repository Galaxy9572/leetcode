## 1、两数之和

> 题目描述

[两数之和](src/main/java/leetcode/editor/cn/doc/content/TwoSum.md)

> 数据结构

哈希表

> 解题思路


## 20、有效的括号

> 题目描述

[有效的括号](src/main/java/leetcode/editor/cn/doc/content/ValidParentheses.md)

> 数据结构

栈

> 解题思路

- 碰到左括号入栈，碰到右括号弹栈比较与当前循环括号的对应右括号是否相同

## 146、LRU Cache

> 题目描述

[LRU Cache](src/main/java/leetcode/editor/cn/doc/content/LruCache.md)

> 数据结构

哈希表 + 双向链表

> 解题思路

- 使用哈希表查找可以达成O(1)的查询时间复杂度
- 在插入和查询时都需要将插入和查询的数据移到链表的头部，代表最新使用的元素
- 链表元素满了需要将尾部的元素删除

## 155、最小栈

> 题目描述

[最小栈](src/main/java/leetcode/editor/cn/doc/content/BaoHanMinhanShuDeZhanLcof.md)

> 数据结构

两个栈

> 解题思路

- 一个栈用来存储数据，一个栈用来存储最小值序列
- 最小值栈入栈必须保证：当后来的值比栈顶（最小值）都小或者等于时才允许入栈，必须要写等于，不然有多个相同的最小值时，只会有一个值入栈，导致peek报空栈异常

## 剑指offer 06、从尾到头打印链表

> 题目描述

[最小栈](src/main/java/leetcode/editor/cn/doc/content/CongWeiDaoTouDaYinLianBiaoLcof.md)

> 数据结构

栈

> 解题思路

- 使用栈先入后出的特性，可以反向打印链表的值

## 剑指 Offer 24.反转链表

> 题目描述

[最小栈](src/main/java/leetcode/editor/cn/doc/content/FanZhuanLianBiaoLcof.md)

> 算法

双指针

> 解题思路

- 需要三个变量prev, cur, temp
- prev: 表示某个节点的上一个节点，上一个节点即代表链表翻转后的next节点
- temp: 把当前节点的下一个节点先保存起来，方便下个循环指向它
- cur: 当前操作的节点