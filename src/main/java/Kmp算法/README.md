## 字符串是否包含子串问题

* 字符串匹配算法
* 用于在一个文本串S内查找一个模式串P 的出现位置
* 利用之前判断过的信息，通过一个next数组，保存模式串中前后最长公共子序列的长度，
* 每次回溯时，通过next数组找到前面匹配过的位置，省去大量的计算时间
* 每次后移的位置 = 已匹配的长度 - 部分匹配表的值
* 暴力匹配：每次后移1
* */
