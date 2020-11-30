class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        
        int count = 1;

        
        Queue<String> q = new LinkedList();
        HashSet<String> visited = new HashSet<String>();
        q.add(beginWord);
        while(!q.isEmpty()) {
            for(int i = 0; i < q.size();i++) {
                String curr = q.poll();
                System.out.println(curr);
                System.out.println(count);
                if(curr.equals(endWord)) {
                    return count+1;
                }
                
                visited.add(curr);
                for(String s: findOneAway(curr, wordList, visited)) {
                        q.add(s);
                        
                }
                  
            }
             
            count++;
        
        }
        return 0;

        
    }
    
        public List<String> findOneAway(String word, List<String> wordList, HashSet<String> visited){
        
        List <String> oneAway = new ArrayList<String>();
        for(String s: wordList){
            if(!visited.contains(s) && isOneAway(word, s)) {
                oneAway.add(s);
                
            }
            
        }
        return oneAway;
        
        
        
    }
    
    public boolean isOneAway(String a, String b){
        int char_diff = 0;
        for(int i = 0; i <a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)){
                char_diff++;
            }
            
            
        }
        return (char_diff==1);
        
        
    }
    

    

    

    

    
    
    
    
    
}
