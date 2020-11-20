class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
        int count = 0;
        
        HashMap<Integer, Integer> ABSum = new HashMap<Integer, Integer>();
        
        for(int i =0; i < A.length; i++){
            for(int j = 0; j < B.length; j++) {
                ABSum.put(A[i]+B[j],ABSum.getOrDefault(A[i]+B[j],0)+1);
              
                
            }
        }
        
        System.out.println(ABSum);

            
            
            
        for(int i = 0; i < C.length;i++) {
            for(int j = 0; j < D.length;j++) {
                count+=ABSum.getOrDefault(-(C[i]+D[j]),0);
                
                
            }
        }
        
        

        
        
       return count; 
        
    }
                          
}
                          
