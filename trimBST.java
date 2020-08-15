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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        
        if (root == null) {
           
        }
        else if (root.val < L) {
            root = root.right;
            root = trimBST(root, L, R);
            return root;
            
        } else if (root.val > R) {
            root =root.left;
            root = trimBST(root, L , R);
            return root;
            
        }
        else {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L , R);
            return root;
        }
        
        return root;
        
        
        
    }
}
