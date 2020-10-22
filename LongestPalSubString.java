class Solution {
    public String longestPalindrome(String s) {
        
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        if (s.length() ==2) {
            if(s.charAt(0) == s.charAt(1)) {
                return s;
            } else {
                return s.substring(0,1);
            }
        }
        
        else{
            int left = 0;
            int right = 1;
            for(int i = 0; i < s.length() -1; i++) {
                System.out.println(left);
                System.out.println(right);
                int len_found = expand(i, i+1, s);
                if (len_found > right-left) {
                    left = i - len_found/2+1;
                    right = i+ len_found/2+1;
                    
                }
                len_found = expand(i,i, s);
                if (len_found > right-left) {
                    left = i - len_found/2+1;
                    right = i + len_found/2;
                    
                }
                
                
                
            }
            
            
            return s.substring(left, right);
            
            
            
        }
            
                            
}
    
    public int expand(int left,int right, String s) {
        int l = left;
        int r = right;
        while(r < s.length() && l >= 0 && s.charAt(r) == s.charAt(l)) {
            l--;
            r++;
        }
        
        return r-l;
        
        
    }
    
}
