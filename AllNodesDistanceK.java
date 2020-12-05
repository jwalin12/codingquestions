/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {

        
        HashMap<TreeNode, TreeNode> node_to_parent = new HashMap<TreeNode, TreeNode>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        s.push(root);
        TreeNode curr = root;
        //annotate parents
        while(curr != target) {
            curr = s.pop();
            
            
            if(curr.left!= null){
                node_to_parent.put(curr.left, curr);
                s.push(curr.left);
                
            }
            if(curr.right != null){
                node_to_parent.put(curr.right, curr);
                s.push(curr.right);
                
            }
            
            
        }
        
        
        
        List<Integer> output = new ArrayList<Integer>();
        
        //level order from target to get kth from below
        
        int dist = K;
        
        ArrayList<TreeNode> currLevel = new ArrayList<TreeNode>();
        currLevel.add(target);
        
        ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode>();
        HashSet<TreeNode> visited = new HashSet<TreeNode>();
        
        while(!currLevel.isEmpty()){
            
            
            if(dist == 0) {
                for (TreeNode c:currLevel){
                    output.add(c.val);
                }
                break;
            }
            
            
            
            for(TreeNode c:currLevel){
                visited.add(c);

                
                
                
                if(node_to_parent.keySet().contains(c) && !visited.contains(node_to_parent.get(c))){

                    nextLevel.add(node_to_parent.get(c));
                }
                
                if(c.right!=null && !visited.contains(c.right)){
                    nextLevel.add(c.right);
                    
                }
                if(c.left !=null && !visited.contains(c.left)){
                    nextLevel.add(c.left);
                }
                
            }
            currLevel.clear();
            
            for(TreeNode c:nextLevel){
                currLevel.add(c);
                
            }
            nextLevel.clear();
            dist--;
            
            
            
        }
        


        
        

            
            
                  return output;  
            
            
            
            
            
            
            
        }
        
        
        
        
           
        
        
        
        
        
        

        
        
        
        
        
   
        
        
        
    }
