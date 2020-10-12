class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s_last_occur = new int[256];
        int[] t_last_occur = new int[256];
        
        for(int i = 0; i <s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (s_last_occur[c1] != t_last_occur[c2]) {
                return false;
            }
            else {
                s_last_occur[c1] = i+1;
                t_last_occur[c2] = i+1;
            }
            
        }
        return true;
    }
        
}
