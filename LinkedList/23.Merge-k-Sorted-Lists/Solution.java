/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        Queue<ListNode> q = new PriorityQueue<ListNode>((n1, n2) -> (n1.val - n2.val));
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        for (ListNode n : lists) {
            if (n != null) {
                q.add(n);
            }
        }
        
        while (!q.isEmpty()) {
            temp.next = q.poll();
            temp = temp.next;
            
            if (temp.next != null) {
                q.offer(temp.next);
            }
        }
        
        return dummy.next;
    }
}
