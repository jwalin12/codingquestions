/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null) {
            return head;
        }
        
        
        HashMap<Node, Node> orig_to_copy = new HashMap<Node, Node>();
        
        
        
        
        
        
        Node pointer = head;
        Node first = new Node(pointer.val);

        Node prev = first;
        first.next = pointer.next;
        orig_to_copy.put(pointer, first);
        pointer = pointer.next;
        
        
        
        
        while(pointer != null) {
            Node copy = new Node(pointer.val);
            prev.next = copy;
            prev = copy;
            copy.next = pointer.next;
        
            orig_to_copy.put(pointer, copy);

            pointer = pointer.next;
            
        }
        
        

        
        pointer = head;
        while(pointer != null) {

            Node duplicate = orig_to_copy.get(pointer);
           
            Node rand_dup = orig_to_copy.get(pointer.random);
            duplicate.random = rand_dup;
            pointer = pointer.next;
            

            
        }
        
        
        return first;
        
     
        
        
        
        
    }
}
