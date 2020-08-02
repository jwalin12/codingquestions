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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        } 
        
            TreeNode top = new TreeNode(nums[nums.length/2]);
        if(nums.length == 1) {
            return top;
        }
            
            
            if(nums.length/2 + 1 <= nums.length) {
                int [] right = Arrays.copyOfRange(nums, nums.length/2 +1, nums.length);
               
                top.right = sortedArrayToBST(right);
                
            }
            if(nums.length/2 - 1 >= 0) {
                int[] left = Arrays.copyOfRange(nums, 0, nums.length/2);
                
                top.left = sortedArrayToBST(left);
                
            } 
            
            return top;
                
    }
}
