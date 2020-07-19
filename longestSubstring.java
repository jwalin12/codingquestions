
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 1;
        int left = 0;
        int max_len = 0;
        if (s.equals("")) {
            return 0;
        }
        
            
        Map <Character, Integer> curr = new HashMap <Character, Integer>();
        
            
        while (right < s.length()){
            System.out.print(right);
            curr.put(s.charAt(left),1);
            while(curr.get(s.charAt(right)) == null) {
                curr.put(s.charAt(right), 1) ;
                right +=1;
                if (right >= s.length()){
                    break;
                }
                }
            
            max_len = Math.max(right-left, max_len);
            left +=1;
            right = left + 1;
            curr.clear();
            
            
            }
    return Math.max(max_len, right - left);
        
    }
    
}
