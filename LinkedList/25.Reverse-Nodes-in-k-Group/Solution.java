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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode tempHead = head;
        ListNode prev = dummy;
        
        while (tempHead != null) {
            ListNode last = tempHead;
            int n = k;
            
            while (tempHead != null && n > 0) {
                tempHead = tempHead.next;
                n --;
            }
            
            if (n != 0) {
                prev.next = last;
                break;
            }
            
            ListNode start = reverse(last, k);
            prev.next = start;
            prev = last;
        }
        
        return dummy.next;
    }
    
    public ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        
        while (head != null && k > 0) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            k--;
        }
        
        return prev;
    }
}
