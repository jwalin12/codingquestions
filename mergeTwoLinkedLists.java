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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null) {
            return l2;
        }
        
        if (l2 == null) {
            return l1;
        }
        
        ListNode head = new ListNode();
        ListNode pointer = head;
        
        
        while(l1 != null && l2 != null) {
            pointer.next = new ListNode();
            pointer = pointer.next;
            if (l1.val <= l2.val) {
                pointer.val = l1.val;
                l1 = l1.next;
                
            } else {
                pointer.val = l2.val;
                l2 = l2.next;  
            }
            
           
        }
        
        if (l1 == null) {
            pointer.next = l2;
            
        }
        if(l2 == null) {
            pointer.next = l1;
            
        }
        
        
        return head.next;
        
        
        
    }
}
