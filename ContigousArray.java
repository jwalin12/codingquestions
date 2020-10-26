class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return 0;
        }

        
        
        int[] summed_arr = new int[nums.length];
        if (nums[0] == 0) {
            summed_arr[0] = -1;
        } else {
            summed_arr[0] = 1;
        }
        
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == 1) {
                summed_arr[i] = summed_arr[i-1] +1;
            } else {
                summed_arr[i] = summed_arr[i-1]-1;
                
            }
            
            
        }
        System.out.println(Arrays.toString(summed_arr));
        int max_zero = -1;
        HashMap<Integer, Integer> count_idx = new HashMap<Integer, Integer>();
        int len_contig = 0;
        for(int i = 0; i < summed_arr.length; i++) {
            
            if(summed_arr[i] == 0) {
                max_zero = i;
                
            }
            
            if(!count_idx.keySet().contains(summed_arr[i])) {
                count_idx.put(summed_arr[i], i);
            }
            
            else {
                len_contig = Math.max(len_contig, i - count_idx.get(summed_arr[i]));
            }
            
            
            
        }
        
        
        return Math.max(len_contig, max_zero+1);
        
        
        
        
        
        
} 
    
    
}

