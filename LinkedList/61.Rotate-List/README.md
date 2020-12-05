61. Rotate List

时间复杂度：O（n)

思路：创立fast和slow两个节点，用fast跑一遍得到总长度。然后用k去modify总长度获得需要
移动的总次数。然后移动slow到总次数之前的那个节点，让fast.next变成head，然后让
dummy.next变成slow之后的节点。然后让slow.next = null
