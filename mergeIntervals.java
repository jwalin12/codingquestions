class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (int[]a,int[]b) -> a[0]-b[0]);
        ArrayList<int[]> output = new ArrayList<int[]>();
        
        
        int counter = 1;
        int last_interval = 0;
        while(last_interval < intervals.length){
            int[] merged = new int[2];
            merged[0] = intervals[last_interval][0];
            merged[1] = intervals[last_interval][1];
            System.out.println(Arrays.toString(merged));
            while(counter < intervals.length && merged[1] >= intervals[counter][0]) {
                merged[1] = Math.max(intervals[counter][1], merged[1]);
                counter++;
            }
            output.add(merged);
            last_interval = counter;
            counter = last_interval+1;
            System.out.println(last_interval);
            System.out.println(counter);
            

        }
        
        
    
        int[][] out = new int[output.size()][2];
        
        for(int i = 0; i < output.size(); i++){
            out[i][0] = output.get(i)[0];
            out[i][1] = output.get(i)[1];
            
        }
        return out;


    }
}
