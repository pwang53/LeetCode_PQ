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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        while (head != null && head.next != null) {
            ListNode current = head.next;
            head.next = current.next;
            current.next = head;
            
            temp.next = current;
            temp = head;
            head = head.next;
        }
        
        return dummy.next;
    }
}
