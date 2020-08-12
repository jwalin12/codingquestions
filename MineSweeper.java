class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board.length == 0) {
            return board;
        }
        if (click.length == 0) {
            return board;
        }
        
        int x = click[0];
        int y = click[1];
        
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return board;
        }
        else {
            dfs(board, x, y);
        }
        
        
        
        return board;
        
        
        
        
    }
    
    
    public void dfs(char[][] board, int x, int y) {
        if (x < 0 || y< 0 || x > board.length -1 || y > board[x].length -1) {
            return;
        }
        else {
            
            if (board[x][y] != 'E') {
                return;
            }
            
            
            if (getAdjMines(board, x, y) ==0) {
                System.out.println("X " + x + "Y " + y);
                board[x][y] = 'B';
                dfs(board, x-1,y);
                dfs(board, x-1, y-1);
                dfs(board, x-1,y+1);
                dfs(board,x, y-1);
                dfs(board,x,y+1);
                dfs(board,x+1, y-1);
                dfs(board,x+1, y);
                dfs(board,x+1, y+1);
                return;
                
            } else {
                board[x][y] = (char)(getAdjMines(board, x, y)+'0');
            }
        }
    }
    public int getAdjMines(char[][] board, int x, int y) {
        int mines = 0;
        if (x>0 && y>0) {
            if (board[x-1][y-1] == 'M') {
                mines++;
            }
        }
        if (x>0) {
            if (board[x-1][y] == 'M') {
                mines++;
            }
        }
       
        if (x>0 && y < board[0].length -1) {
            if (board[x-1][y+1] == 'M') {
                mines++;
            }
        }
       
        if (y>0) {
            if (board[x][y-1] == 'M') {
                mines++;
            }
        }
        
        if (y < board[0].length-1) {
            if (board[x][y+1] == 'M') {
                mines++;
            }
        }
        if (x < board.length -1 && y>0) {
            if (board[x+1][y-1] == 'M') {
                mines++;
            }
        }
        if (x <board.length-1) {
            if (board[x + 1][y] == 'M') {
                mines++;
            }
        }
        if (x<board.length-1 && y < board[0].length-1) {
            if (board[x+1][y+1] == 'M') {
                mines++;
            }
        }
        
       
        
        
        return mines;
            
        }
    }
    
    

