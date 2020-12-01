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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int first = (l1 != null) ? l1.val : 0;
            int second = (l2 != null) ? l2.val : 0;
            
            int value = (carry + first + second) % 10;
            carry = (carry + first + second) / 10;
            
            ListNode current = new ListNode(value);
            
            temp.next = current;
            temp = current;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry > 0) temp.next = new ListNode(carry);
        
        return dummy.next;
    }
}
