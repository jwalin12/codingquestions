/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<Integer>();
        
        ArrayDeque<Node> preorder = new ArrayDeque<Node>();
        
        if(root !=null) {
            preorder.add(root);
        }
        
        while(!preorder.isEmpty()) {
            Node curr = preorder.pop();
            output.add(curr.val);
            Collections.reverse(curr.children);
            for(Node child:curr.children){
                preorder.push(child);
            }
        }
        return output;
        
    }
}
