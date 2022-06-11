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