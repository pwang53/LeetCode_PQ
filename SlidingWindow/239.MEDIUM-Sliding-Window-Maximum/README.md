239. Sliding Window Maximum

时间复杂度：O(N)

题目类型：滑动窗口

思路：保持左右指针大小为p的长度。把所有的p中字符加入到hash中后，用count计算，移动
右指针，如果所指字符的hash大于等于零，count要加1，说明窗口内有所要字符。之后移动
左指针，如果左指针移动后hash要变得大于0后，count要减1。如果最后count等于p的长度，
那么把位置放到list中
