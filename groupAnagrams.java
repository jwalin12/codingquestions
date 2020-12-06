class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        
        
        
        
        HashMap<String,ArrayList<String>> sorted_strings = new HashMap<String, ArrayList<String>>();
        
        for(String s:strs){
            String sorted = sort_string(s);
            
            if(!sorted_strings.keySet().contains(sorted)) {
                sorted_strings.put(sorted, new ArrayList<String>());
                
            }
            
            sorted_strings.get(sorted).add(s);
              
        }
        
        List<List<String>> output = new ArrayList<List<String>>();
        
        for (ArrayList<String> a: sorted_strings.values()){
            output.add(a);
        }
        
        return output;
        
    
        
    }
    
    
    
    public String sort_string(String s) {
        
        String output = "";
        
        int[] char_count = new int[26];
        
        for (int i = 0; i <s.length();i++){
            char_count[s.charAt(i) - 97]++;
            
            
            
        }
        
        for(int i = 0; i < char_count.length; i++) {
            
            while (char_count[i] != 0) {
                  output+= (char)i;
                    char_count[i] --;
                
            }
            
            
            
          
            
            
            
        }
        return output;
        
        
        
        
        
    }
    
    
    
}
