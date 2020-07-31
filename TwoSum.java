class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return nums;
        }
        
        int[] output = new int[2];
        
        HashMap <Integer, Integer> dict = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i ++) {
            int currtarg = target - nums[i];
            if (dict.containsKey(currtarg)) {
                return new int []{i, dict.get(currtarg)};
            }
            dict.put(nums[i], i);
            
            
        }
      
                
            
            
        
        return output;
                    }
        
        
        
        
    
}
