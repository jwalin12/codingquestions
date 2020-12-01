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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<TreeNode> currLevel = new ArrayList<TreeNode>();
        boolean rToL  = true;
        List<TreeNode> nextLevel = new ArrayList<TreeNode>();
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        
        if(root == null){
            return output;
        }
        
        currLevel.add(root);
        
        
        while(!currLevel.isEmpty()){
            if (rToL) {
                List <Integer> toOutput = new ArrayList<Integer>(); 
            for(TreeNode i:currLevel) {
                toOutput.add(i.val);
                
            }
                output.add(toOutput);
                Collections.reverse(currLevel);
            for(TreeNode i: currLevel) {
                if(i.right != null) {
                    nextLevel.add(i.right);
                    
                }
                if(i.left != null) {
                    nextLevel.add(i.left);

                }
                
            }
              
                currLevel.clear();
                for(TreeNode i:nextLevel){
                    currLevel.add(i);
                }
                nextLevel.clear();
                rToL = false;
                
            
            
            
            
            
        } else {
                List <Integer> toOutput = new ArrayList<Integer>(); 
            for(TreeNode i:currLevel) {
                toOutput.add(i.val);
                
            }
                output.add(toOutput);
                Collections.reverse(currLevel);
                for(TreeNode i:currLevel) {
                    
                    
                    if(i.left != null) {
                    nextLevel.add(i.left);

                }
                if(i.right != null) {
                    
                    nextLevel.add(i.right);
                    
                }
                
                
            }
                currLevel.clear();
                for(TreeNode i:nextLevel){
                    currLevel.add(i);
                }
                nextLevel.clear();
                
                rToL = true;
                
                
                
                
                
                
            
        }
        
            
        }
        return output;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
