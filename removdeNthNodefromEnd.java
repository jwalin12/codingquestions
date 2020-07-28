class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode checker = head;
        if (head.next == null) {
            return null;
        }
        
        while(n>0) {
            checker = checker.next;
            if (checker == null) {
                return head.next;
            }
            n--;
        }
        
        ListNode slowpointer = head;
        ListNode fastpointer = head.next;
      
            while (checker.next!=null) {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next;
            checker = checker.next;
        }
        slowpointer.next = fastpointer.next;
        fastpointer = null;

        return head;
        
        
        
        
    }
}
