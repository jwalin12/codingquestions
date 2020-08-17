class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String output = "";     
        for (int i = 0; i<words.length; i++) {
            output += " " + reverseString(words[i]);            
        }
        
        return output.trim();
        
    }
    
    public String reverseString(String s) {
        
        String output = "";
        System.out.println(s);
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.println(s.charAt(i));
            output += s.substring(i,i+1);
            
        }
        System.out.println("reversed" + output);
        return output;
        
        
        
    }
    
    
    
    
    
    
}
