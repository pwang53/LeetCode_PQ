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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode l1 = head;
        ListNode l2 = reverse(slow.next);
        slow.next = null;
        
        while (l1 != null &&l2 != null) {
            ListNode nxt1 = l1.next;
            ListNode nxt2 = l2.next;
            l1.next = l2;
            l2.next = nxt1;
            l1 = nxt1;
            l2 = nxt2;
        }
    }
    
    public ListNode reverse(ListNode head) {
        ListNode dummy = null;
        ListNode temp = head;
        
        while (temp != null) {
            ListNode nxt = temp.next;
            temp.next = dummy;
            dummy = temp;
            temp = nxt;
        }
        
        return dummy;
    }
}
