class Solution {
    public int numIslands(char[][] grid) {
        
        
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int num_islands = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j <grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    num_islands += 1;
                    dfs(i,j, grid);
                }
            }
        }
        
        return num_islands;
        
    }
    
    
    public void dfs(int i, int j, char[][] grid) {
       
        if (!(i < 0 || j < 0) && !(i >= grid.length || j >= grid[0].length)) {
             System.out.println("i" + i);
            System.out.println("j" + j);
            if (grid[i][j] == '1') {
            grid[i][j] = '0';
            dfs(i-1, j, grid);
            dfs(i,j-1,grid);
            dfs(i+1, j, grid);
            dfs(i, j+1,grid);   
            }
        
        }
        
    }
    
}
