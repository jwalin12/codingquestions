class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        if(nums.length ==0) {
            return output;
        }
        
        if (nums.length == 1) {
            System.out.println("this case");
            ArrayList<Integer> perm = new ArrayList<Integer>();
            perm.add(nums[0]);
            output.add(perm);
            
            return output;
        } else {
            List<Integer> perm = new ArrayList<Integer>();
            permuteHelper(nums, output, perm );
        }
        return output;
        
    
       
        
        
        
        
    }
    
    public void permuteHelper(int[] nums, List<List<Integer>> output, List<Integer> perm) {

        if (perm.size() == nums.length && !output.contains(perm)) {
            List<Integer> permcopy = new ArrayList<Integer>();
            for (int i : perm) {
                permcopy.add(i);
            }
            output.add(permcopy);
        } else {
            for(int i = 0; i < nums.length; i++) {
                perm.add(nums[i]);
                if (isValid(perm)) {
                    permuteHelper(nums, output, perm);
                }
                 perm.remove(perm.size()-1);
            }
           
            
        }
        
         
        
        
    }
    
    public boolean isValid(List<Integer> perm) {
        HashSet set = new HashSet(perm);
        System.out.println("SET" + set);
        System.out.println("PERM" + perm);
        return set.size() == perm.size();
    }
    
    
      
  
    
    }
    
   
    
  
