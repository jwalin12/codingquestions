class Trie {

    /** Initialize your data structure here. */
    Map <Character, Trie> head;
    public Trie() {
         head = new HashMap <Character, Trie>();
        
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (search(word)) {
            return;
        }
        if (word.length() == 0) {
            head.put(null, null);
            return;
        }
        if (head.containsKey(word.charAt(0))) {
            head.get(word.charAt(0)).insert(word.substring(1));
        } else {
            head.put(word.charAt(0), new Trie());
            head.get(word.charAt(0)).insert(word.substring(1));
                
        }
        
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        
        if (word.length() == 0 && head.containsKey(null)) {
            return true;
        } 
        if (word.length() > 0 && head.containsKey(word.charAt(0))) {
            return head.get(word.charAt(0)).search(word.substring(1));
        }
        return false;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
     
         if (prefix.length() == 1 && head.containsKey(prefix.charAt(0))) {
            return true;
        } 
        if (head.containsKey(prefix.charAt(0))) { 
            return head.get(prefix.charAt(0)).startsWith(prefix.substring(1));
        }
        return false;
        
        
    }
}
