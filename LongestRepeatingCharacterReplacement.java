class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() == 0) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }
        
        
        
        
        int[] lettersInWindow = new int[26];
        int startWindow = 0;
        int maxLen = 1;
        int maxInArray = 1;
        lettersInWindow[s.charAt(startWindow) - 'A']++;
        
        for(int endWindow = 1; endWindow < s.length(); endWindow++) {
            lettersInWindow[s.charAt(endWindow) - 'A']++;
            maxInArray = Math.max(maxInArray,lettersInWindow[s.charAt(endWindow) - 'A'] );
            if(endWindow - startWindow - maxInArray +1 > k) {
                lettersInWindow[s.charAt(startWindow) - 'A']--;
                startWindow++;
            }
            maxLen = Math.max(maxLen, endWindow - startWindow +1);
            
            
        }
        return maxLen;
}
}
