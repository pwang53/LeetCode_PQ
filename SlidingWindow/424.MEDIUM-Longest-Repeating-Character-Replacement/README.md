424. Longest Repeating Character Replacement

时间复杂度：O(n)

题目类型：滑动窗口

思路：找到窗口内出现最大次数的字符，统计它出现的次数。如果滑窗的长度减去此字符出现
的次数（剩下的就是需要调换的字符）大于K了,那就左移.
