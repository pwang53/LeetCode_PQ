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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = head;
        
        int length = 1;
        
        while (fast.next != null) {
            length ++;
            fast = fast.next;
        }
        
        int mod = k % length;
        int shift = length - mod;
        
        for (int i = 0; i < shift - 1; i++) {
            slow = slow.next;
        }
        
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        
        return dummy.next;
    }
}
