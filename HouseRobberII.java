class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        } 
        if(nums.length ==1) {
            return nums[0];
        }
        if(nums.length ==2 || nums.length == 3) {
            return Math.max(nums[0], nums[1]);
        }
        int n = nums.length;
        
        int nums1[] = new int[nums.length-1];
        int nums2[] = new int[nums.length-1];
        System.arraycopy(nums, 0,nums1,0, nums.length-1);
        System.arraycopy(nums, 1,nums2,0, nums.length-1);
        return Math.max(robHelper(nums1),robHelper(nums2));
        
        
        
        
        
        
    }
    
    public int robHelper(int [] nums) {
        System.out.println(Arrays.toString(nums));
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];
        
        
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i-2], nums[i] + dp[i-3]);
        }
         System.out.println(Arrays.toString(dp));
        return Math.max(dp[dp.length-1], dp[dp.length - 2]);
    }
       
        
    
}
