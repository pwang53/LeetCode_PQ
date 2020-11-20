3. Longest Substring Without Repeating Characters

题型：滑动窗口

时间复杂度： O(n)

思路：用hash计算窗口内出现字符的次数，一旦超出2个就把左指针向右移。计算最大长度
