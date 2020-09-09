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
    public int kthSmallest(TreeNode root, int k) {
        if(k==0 || root == null) {
            return root.val;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
       
        
        
        while(true) {
            while (root !=null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            k--;
            if(k<=0) {
                return root.val;
                
            }
            root = root.right;
        }
       
                                 
        
    }
    

}
