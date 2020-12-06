83. Remove Duplicates from Sorted List

时间复杂度：O(N)

思路：当本身或者下一个不是null的时候，比较本身和下一个是否值一样。如果一样那么就让
本身指针指到下一个。否则就直接转到下一个。
