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
    public ListNode insertionSortList(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode sortedListHead = new ListNode(head.val);
        
        ListNode pointer = head.next;
        ListNode placeholder = sortedListHead;
        ListNode sorter = sortedListHead.next;
        int currval;
        while (pointer != null) {
            currval = pointer.val;
            
            if (currval < sortedListHead.val) {
                sortedListHead = new ListNode(currval, sortedListHead);
                 sorter = sortedListHead.next;
                ListNode printer = sorter;
             
                 
                
                
            } else {
                System.out.println("CURR" + currval);
                while(sorter != null
                      && currval > sorter.val ) {
                    placeholder = placeholder.next;
                    sorter = sorter.next;
                    
                    
            }
                
                if (sorter !=null) {
                placeholder.next = new ListNode(currval, sorter);
                
            } else {
        
                placeholder.next = new ListNode(currval);
            }
            
            
            
           
        }
            sorter = sortedListHead.next;
            placeholder = sortedListHead;
            
          pointer = pointer.next;  
        
    }
        return sortedListHead;
    }
}
