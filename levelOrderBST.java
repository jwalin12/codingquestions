class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        if(root == null) {
            return new ArrayList<List<Integer>> ();
        }
        
        List<List<Integer>> output = new  ArrayList<List<Integer>>();
        ArrayDeque <List<TreeNode>> qu = new ArrayDeque <List<TreeNode>> ();
        qu.add(Arrays.asList(root));
        List<TreeNode> currNodes;
        
            while (!qu.isEmpty()) {
                currNodes = qu.remove();
                System.out.println(currNodes);
                ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode> ();
                ArrayList<Integer> currLevel = new ArrayList<Integer> ();
                for (int i =0; i < currNodes.size(); i++) {
                    TreeNode currNode = currNodes.get(i);
                    currLevel.add(currNode.val);
                    
                    System.out.println(output);
                    if (currNodes.get(i).left != null) {
                        System.out.println("left is there");
                        nextLevel.add(currNode.left);
                    }
                    if (currNodes.get(i).right != null) {
                        System.out.println("right is there");
                        nextLevel.add(currNode.right);
                    }
                }
                if (!nextLevel.isEmpty()) {
                    qu.add(nextLevel);  
                }
                output.add(currLevel);
                
                System.out.println(qu);
                    
            }
        
        
        return output;
        
    }
}
