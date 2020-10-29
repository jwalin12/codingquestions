class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        
        PriorityQueue<Integer> pQueue =  
             new PriorityQueue<Integer>((a,b) -> count.get(b) - count.get(a)); 
        
        
        
        
        for(int i = 0; i < nums.length;i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) +1);
            
            
        }
        System.out.println(count);
        
        for(int i :count.keySet()) {
            pQueue.add(i);
            
        }
        
        
        int[] output = new int[k];
        for(int i = 0; i < k; i++){
            output[i] = pQueue.poll();
            
        } 
        
        return output;
        
        
        
        
    }
    
    
  
    
    
    
    
    
    
    
}
