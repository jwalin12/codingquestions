class Solution {
    public int maxSubArray(int[] nums) {
       if(nums.length == 0) {
           return 0;
       }
        if(nums.length == 1) {
            return nums[0];
        }
        
        
        int[] dp = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            dp[i] = helper(nums, nums[i], i + 1);
        }
        
        
        
        Arrays.sort(dp);
        return dp[dp.length-1];
    }
    
    
    public int helper(int[] nums, int running_sum, int index) {
        if(index == nums.length) {
            return running_sum;
        }
        
     
    
        
        return Math.max(
            helper(nums, running_sum + nums[index], index+1),
            running_sum
        );
    }
}
