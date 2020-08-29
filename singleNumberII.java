class Solution {
    public int singleNumber(int[] nums) {
       int [] bitCount = new int[32];
        int output = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];  
                for (int j = 0; j < 32; j++) {
                
                bitCount[j] += curr&1;
                curr >>= 1;  
                
                }
              
        }
        System.out.println(Arrays.toString(bitCount)); 
        
        for (int j = bitCount.length-1; j >= 0; j--) {
            System.out.println(j);
            output += bitCount[j]%3;
            System.out.println(output);
            if(j>0) {
                output= output<<1;
            }
        
        }
        return output;
        
        
    }
}
