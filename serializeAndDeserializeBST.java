/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if(root == null) {
            return "";
        }
        
        String output = "";
        
        output+= root.val + ",";
        output+=serialize(root.left);
        output+=serialize(root.right);
        return output;
        
        
        
        
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        HashSet<Integer> used = new HashSet<Integer>();
        String[] data_arr = data.split(",");
        return helper(data_arr, used);
    }
        
       
            
            
        
    
    public TreeNode helper(String[] data_arr, HashSet<Integer> used) {
        
        if(data_arr.length == 0) {
            return null;
        } 
        
        if(data_arr[0] == ""){
            return null;
        }
        
        int root_val = Integer.parseInt(data_arr[0]);
        TreeNode root = new TreeNode(root_val);
        
        if(data_arr.length >1) {
            int idx = 1;
            
            while(idx < data_arr.length && Integer.parseInt(data_arr[idx]) < root_val){
                idx++;
            }
            if(idx!= data_arr.length){
                if (!used.contains(Integer.parseInt(data_arr[idx]))) {
                    used.add(Integer.parseInt(data_arr[idx]));
                    String [] subarray = new String[data_arr.length - idx];
                    System.arraycopy(data_arr, idx, subarray, 0,data_arr.length - idx );
                    root.right = helper(subarray,used);
                }
                
            }
            if (idx!= 1){
                String [] subarray = new String[data_arr.length - 1];
                used.add(Integer.parseInt(data_arr[1]));
                System.arraycopy(data_arr, 1, subarray, 0,data_arr.length - 1);
                root.left = helper(subarray, used);
            }
            
            
            
            
        }
        return root;
        
        
        
        
        
    
            
    }
                                   
        
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
