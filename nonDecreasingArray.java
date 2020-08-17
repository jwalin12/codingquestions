class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        
        
        boolean modified = false;
        int max_val = Integer.MIN_VALUE;
        int temp;
        for (int i = 0 ; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                if (modified)  {
                    return false;
                }
                else {
                temp  = nums[i];
                nums[i] = max_val;
                if (isIncreasing(nums)) {
                    System.out.println("hits!");
                    modified = true;
                    
                } else {
                    nums[i] = temp;
                    nums[i+1] = nums[i] +1;
                    if (isIncreasing(nums)) {
                        modified = true;
                    }
                    else {
                        return false;
                    }
                }
                    
                }
                
                
                
            }
            max_val = nums[i];
            
        } 
        return true;
        
        
        
        
    }
    public boolean isIncreasing(int[] nums) {
        for (int i =0; i < nums.length -1; i++) {
            if (nums[i] > nums[i+1]) {
              return false;  
     
        }
    }
        return true;
}
    
}
