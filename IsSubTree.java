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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        if(s == null && t== null) {
            return true;
        } 
        if(s==null) {
            return false;
        }
        if(t== null) {
            return false;
        }
       
        
        
        
        if(t.val == s.val) {
            return isSubTreeHelper(s, t) ||  isSubtree(s.right, t) || isSubtree(s.left,t);
            
        }
        
        
        return isSubtree(s.right, t) || isSubtree(s.left,t);
    

        
    }
    
    
   boolean isSubTreeHelper(TreeNode s, TreeNode t) {
       
       
        
       
        if(s == null && t== null) {
            return true;
        } 
        if(s==null) {
            return false;
        }
        if(t== null) {
            return false;
        }
        
        if(s.val != t.val) {
            return false;
        }
        
        
        
        return isSubTreeHelper(s.right,t.right) && isSubTreeHelper(s.left,t.left);
        
    }
}
