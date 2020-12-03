class Solution {
    public int compareVersion(String version1, String version2) {
        
        
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        
        
        int maxLen = Math.max(v1.length, v2.length);
        System.out.println(Arrays.toString(v1));
        System.out.println(maxLen);
        for(int i = 0; i < maxLen; i++) {
            
            int from_1 = 0;
            int from_2 = 0;
            if(i < v1.length) {
                from_1 = Integer.parseInt(v1[i]);
            }
            if(i < v2.length) {
                from_2 = Integer.parseInt(v2[i]);
            
            }
            
            System.out.println(from_1);
            System.out.println(from_2);
            if(from_1>from_2){
                return 1;
            }
            if(from_2>from_1){
                return -1;
            }
          
        }
        
        return 0;
        
        
        
        
        
    }
    

    
    
    
    
}
