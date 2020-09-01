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
    public ListNode oddEvenList(ListNode head) {
        
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode oddpointer = head;
        
        ListNode evenpointer = head.next;
        ListNode evenhead = evenpointer;
        while(evenpointer.next !=null && oddpointer.next !=null) {
            System.out.println("OP" + oddpointer.val);
            System.out.println("EP" + evenpointer.val);
        oddpointer.next = evenpointer.next;
        oddpointer = oddpointer.next;
        evenpointer.next = oddpointer.next;
        evenpointer = evenpointer.next;
            
           
           
           
       
        }
        
        
        
        return head;
