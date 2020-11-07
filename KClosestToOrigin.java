class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        PriorityQueue <int[]> p = new PriorityQueue <int[]>((a,b)->Integer.compare(distance((int[])b), distance((int[])a)));
        int[][] output = new int[K][2];
        
        for(int i = 0; i < points.length;i++) {
            int dist = (int)(Math.pow(points[i][0],2) + Math.pow(points[i][1],2));
            p.add(points[i]);
            
            if(p.size() > K) {
                p.poll();
            }
        }
        


        return p.toArray(new int[K][2]);
        
        
        
       
    
    }
    public int distance(int[]a){
        return (int)(Math.pow(a[0],2)+Math.pow(a[1],2));
    }
}
