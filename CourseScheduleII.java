class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        
        
        ArrayList<Integer> ordering = new ArrayList<Integer>();
        
        
        
        HashSet<Integer> starting_points = new HashSet<Integer>();
        
        
        HashSet<Integer> allVisited = new HashSet<Integer>();
        
        for(int i = 0; i < numCourses;i++) {
            starting_points.add(i);
            
        }
        for(int i = 0; i < prerequisites.length;i++) {
            
            starting_points.remove(prerequisites[i][0]);
            
        }
        
        for(int i: starting_points) {
            HashSet<Integer> currPath = new HashSet<Integer>();
            
            
            if(!dfs(i,currPath, allVisited, prerequisites, ordering)) {
               return new int[0];
            }
        }
        
        if (ordering.size() != numCourses) {
            return new int[0];
        }
        
        int[] arr = new int[numCourses];
        for(int i = 0; i< ordering.size(); i++) {
            arr[i] = ordering.get(i);
            
        }
        return arr;
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    public boolean dfs(int curr,HashSet<Integer> currPath, HashSet<Integer> visited, int[][]prerequisites, ArrayList<Integer> ordering) {
        
        
        if(currPath.contains(curr)) {
            return false;
        }
        currPath.add(curr);
        
        
        
        for(int i = 0; i <prerequisites.length; i++) {
            if(prerequisites[i][1] == curr && !visited.contains(prerequisites[i][0])){
                if (!dfs(prerequisites[i][0], currPath, visited, prerequisites, ordering)) {
                    return false;
                }
                
                
                
                
            }
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        currPath.remove(curr);
        visited.add(curr);
        ordering.add(0,curr);
        return true;
        
        
        
        
        
    }
    
    
    
    
    
    
}
