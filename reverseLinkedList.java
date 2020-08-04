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
    public ListNode reverseList(ListNode head) {
        
        
        if(head == null) {
            return head;
            
        }
        
        if (head.next == null) {
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp = curr;
        prev.next = null;
        
        while(curr != null) {
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp; 
            
        }
        
        
     return prev;
        
    }
    
    
}
