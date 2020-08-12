class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        
        HashSet<List<Integer>> TouchesPacific = new HashSet<List<Integer>>(); 
         HashSet<List<Integer>> TouchesAtlantic = new HashSet<List<Integer>>();
         List<List<Integer>> TouchesBoth = new ArrayList<List<Integer>>(); 
        if (matrix.length == 0 ) {
            return TouchesBoth;
            
        }
        
        PacificDFS(matrix, 0, 0, matrix[0][0], TouchesPacific);
        
        AtlanticDFS(matrix, matrix.length - 1, matrix[0].length - 1 , matrix[matrix.length -1][matrix[0].length - 1], TouchesAtlantic);
        System.out.println(TouchesPacific);
        for (List<Integer> i:TouchesPacific){
            if (TouchesAtlantic.contains(i)) {
                TouchesBoth.add(i);
            }
        }
        return TouchesBoth;
        
    }
    
    
    
    public void PacificDFS(int[][] matrix, int x, int y, int greaterThan, HashSet<List<Integer>> TouchesPacific) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length ) {
            return ;
        }
        
        ArrayList<Integer> coords = new ArrayList<Integer>();
            coords.add(x);
            coords.add(y);
        if (TouchesPacific.contains(coords)) {
            return;
        }
        
        
        if (x == 0 || y == 0) {
            
            TouchesPacific.add(coords);
            PacificDFS(matrix, x +1, y, matrix[x][y], TouchesPacific);
            PacificDFS(matrix, x, y +1, matrix[x][y], TouchesPacific);
            
        }
        
        
        
        
        
         else if (matrix[x][y] >= greaterThan) {
            
            TouchesPacific.add(coords);
            PacificDFS(matrix, x -1, y, matrix[x][y], TouchesPacific);
            PacificDFS(matrix, x +1, y, matrix[x][y], TouchesPacific);
            PacificDFS(matrix, x, y-1, matrix[x][y], TouchesPacific);
            PacificDFS(matrix, x, y +1, matrix[x][y], TouchesPacific);
            
        }
        
        
        
    }
    
        public void AtlanticDFS(int[][] matrix, int x, int y, int greaterThan, HashSet<List<Integer>> TouchesAtlantic) {
        
        
        
        if (x < 0 || y < 0 || x >= matrix.length || y >=matrix[0].length ) {
            return ;
        }
            
            ArrayList<Integer> coords = new ArrayList<Integer>();
            coords.add(x);
            coords.add(y);
        
            if (TouchesAtlantic.contains(coords)) {
                return;
            }
        
         if ((x == matrix.length -1 || y ==matrix[0].length - 1)) {
            
            TouchesAtlantic.add(coords);
            AtlanticDFS(matrix, x -1, y, matrix[x][y], TouchesAtlantic);
            
            AtlanticDFS(matrix, x, y-1, matrix[x][y], TouchesAtlantic);
            
        }
        
        
        
        if (matrix[x][y] >= greaterThan) {
            TouchesAtlantic.add(coords);
            AtlanticDFS(matrix, x -1, y, matrix[x][y], TouchesAtlantic);
            AtlanticDFS(matrix, x +1, y, matrix[x][y], TouchesAtlantic);
            AtlanticDFS(matrix, x, y-1, matrix[x][y], TouchesAtlantic);
            AtlanticDFS(matrix, x, y +1, matrix[x][y], TouchesAtlantic);
            
        }
        
        
        
    }
    
    
}
