    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length ==1) {
            return ;
        }
        k = k%nums.length;
        if (k==0) {
            return;
        }
        int temp;
        for (int i = 0; i < nums.length/2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - i -1];
            nums[nums.length - i -1] = temp;
               
        }
        
        for (int i =0; i < k/2; i++) {
            temp = nums[i];
            nums[i] = nums[k - i -1];
            nums[k - i -1] = temp;
            
        }
        for (int i =k; i < (nums.length+k)/2; i++) {
            temp = nums[i];
            nums[i] = nums[k + nums.length - i -1];
           nums[k + nums.length - i -1] = temp;
            
        }
        
        
            
                
            
        }
    
    
 
        
        
            
        
    }
