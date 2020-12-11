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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return toBST(head, null);
    }
    
    public TreeNode toBST(ListNode start, ListNode end) {
        ListNode slow = start;
        ListNode fast = start;
        if (start == end) return null;
        
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode tree = new TreeNode(slow.val);
        tree.left = toBST(start, slow);
        tree.right = toBST(slow.next, end);
        
        return tree;
    }
}
