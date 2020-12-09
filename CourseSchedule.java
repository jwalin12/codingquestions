class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        
        if(prerequisites.length == 0) {
            return true;
        }
        
        
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
            
            
            if(!helper(numCourses, prerequisites, i,currPath, allVisited)) {
                return false;
            }
        }
        
        return numCourses == allVisited.size();
        
        

        

     
               }
    
    
    
    
    public boolean helper(int numCourses, int[][] prerequisites, int curr,  HashSet<Integer> currPath, HashSet<Integer> allVisited) {
        System.out.println(curr);
        System.out.println(currPath);
        
        
        
        if(!currPath.add(curr)) {
            return false;
        }
        
    
        
        for(int i = 0; i < prerequisites.length;i++) {
            if(prerequisites[i][1] == curr && !allVisited.contains(prerequisites[i][0]))  {
                if (!helper(numCourses, prerequisites, prerequisites[i][0], currPath, allVisited)) {
                    return false;
                    
                }
                
            }
            
        }
        
        
        
        currPath.remove(curr);
        allVisited.add(curr);
        
        
        return true;      
    }
    
    
    

        
        
        
    }
    

    
    

        
        
        
        
        
        
        
        
        
        
    
