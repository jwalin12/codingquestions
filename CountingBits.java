class Solution {
    public int[] countBits(int num) {
        int[] output = new int[num+1];
        
        
        if(num == 0) {
            return output;
        }
        output[1]= 1;
        int iter = 1;
        
        while(iter<=num) {
            int nextPowerOfTwo = 2*iter;
            int currPowerOfTwo = iter;
            
            output[iter] = 1;
            
            while(iter<nextPowerOfTwo && iter<=num) {
                if(iter%2 == 1) {
                    output[iter] = output[iter-1]+1;
                    
                    
                } else {
                    
                    output[iter] = output[iter - currPowerOfTwo]+1;
                    
                }
                iter++;
                
                
                
                
            }
            
            
            
            
            
            
            
        }
        return output;
        
        
        
        
        
        
        
    }
}
