class Solution {
    public void sortColors(int[] nums) {
        
        
        if (nums.length ==0 || nums.length == 1) {
            return;
        }
        int zeroidx = 0;
        
        int twoidx = nums.length-1;
        
       for(int i = 0; i < nums.length; i++) {
           if (nums[i] == 0) {
               swap(i, zeroidx, nums);
               zeroidx++;
           }
       }
        for(int i = nums.length-1; i>=0; i--) {
            if(nums[i] == 2) {
                swap(i, twoidx, nums);
                twoidx--;
                
            }
        }
        
        
        
        
        
       
        
        
        
        
        
    }
    
    public void swap(int i, int j, int[] nums) {
        
        if(i==j) {
            return;
        }
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
