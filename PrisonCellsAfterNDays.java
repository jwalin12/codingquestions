class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        
        
        int counter = 0;
        int modulo = 1;
        HashMap <String, Integer> n_to_cell = new HashMap<String, Integer>();
        while(counter < N) {
            int[] next = nextDay(cells, 1);
            System.out.println(n_to_cell);
            if(n_to_cell.keySet().contains(Arrays.toString(next))) {

                    modulo = counter - n_to_cell.get(Arrays.toString(next));
                  
                    
                
                return nextDay(cells, N%(modulo));
                
            } else {
                n_to_cell.put(Arrays.toString(next), counter);
                cells = next;
                counter++;
            }
          
           
            
        
            
            
        }
        return cells; 
        
    
    }
    
    public int[] nextDay(int [] cells, int N) {
        for(int j =0; j<N; j++) {
            int[] new_cell = new int[cells.length];
            for(int i = 0; i < cells.length; i++) {
            if(i == 0 || i == cells.length -1) {
                new_cell[i] = 0;
            } else {
                
                if(cells[i-1] == cells[i+1]) {
                    new_cell[i] = 1;
                } else {
                    new_cell[i] = 0;
                }
            }
            
        }
            cells = new_cell;
            
        }
        return cells;
        
    }
}
