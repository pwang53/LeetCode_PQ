209.MEDIUM-Minimum-Size-Subarray-Sum

题型：滑动窗口

时间复杂度：O(n)

思路：为了找到最小长度，利用左右指针，右指针不停向右，一旦和超过了指定数后
计算此时的长度并且和最小长度作比较得出最小长度。之后窗口内和减小，左指针向
右。
