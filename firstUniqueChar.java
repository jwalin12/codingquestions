class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        if (s.length() ==1) {
            return 0;
        }
        char curr;
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length() ; i++) {
            curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            
                
                } 
        
        for (char c: map.keySet()) {
            if(map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
        
       
        
       
    }
}
