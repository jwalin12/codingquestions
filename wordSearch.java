class Solution {
    public boolean exist(char[][] board, String word) {
        
        
        if (word.length() > board.length * board[0].length) {
            return false;
        }
        
        
        char[] word_arr = word.toCharArray();
        for(int i = 0 ; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                boolean[][] visited = new boolean[board.length][board[0].length];
                if(helper(board, i, j, word_arr, 0, visited)) {
                    return true;
                }
            }
        }
        
        
        return false;
        
        
        
        
    
        
        
    }
    
    
    public boolean helper(char[][]board, int i, int j, char[] word, int word_idx, boolean[][]visited) {
        
        if (i <0 || j<0 || i >=board.length || j >= board[0].length || visited[i][j]) {
            return false;
        }
        
        
        
        if(word[word_idx] == board[i][j]) {
            visited[i][j] = true;
            word_idx++;
        } else {
            visited[i][j] = false;
            return false;
        }
        if(word_idx == word.length) {
            return true;
        }
        
        if(helper(board, i+1, j, word, word_idx, visited) || helper(board, i-1, j, word, word_idx, visited) || helper(board, i, j+1, word, word_idx, visited) ||  helper(board, i, j-1, word, word_idx, visited)) {
            return true;
              
            
        }
        
        
        visited[i][j] = false;
        return false;
        
        
        
        
        
        
        
        
        
        
        
        

       
        
        
        
    }
  
    

    
    
    

    
    
    
    
    
    
}
