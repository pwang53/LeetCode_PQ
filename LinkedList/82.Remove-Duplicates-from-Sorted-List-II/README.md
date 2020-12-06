82. Remove Duplicates from Sorted List II

时间复杂度：O（N)

思路:遍历，如果有重复的就让curr到最后一个重复的，然后让prev.next = curr.next。
如果不重复，prev = prev.next, curr = curr.next;
