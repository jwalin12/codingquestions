class Solution {
    public int maxDistToClosest(int[] seats) {
        int[] fromLeft= new int[seats.length];
        int[] fromRight = new int[seats.length];
        
        
        int leftDist;
        if (seats[0] == 1) {
            leftDist =0;
        } else {
            leftDist = seats.length;
        }
        fromLeft[0] = leftDist;
        for(int i = 1; i < seats.length; i++) {
            if(seats[i] == 1) {
                leftDist = 0;
                
            } else {
                leftDist++;
            }
            fromLeft[i] = leftDist;
            
            
        }
        
        int rightDist;
        if (seats[seats.length-1] == 1) {
            rightDist = 0;
        } else {
            rightDist = seats.length;
        }
        fromRight[seats.length-1] = rightDist;
        for(int i = seats.length-2; i >= 0; i--) {
            if(seats[i] == 1) {
                rightDist = 0;
                
            } else {
                rightDist++;
            }
            fromRight[i] = rightDist;
            
            
        }
        
        int maxDist = 1;
        for(int i = 0; i < seats.length; i++) {
            maxDist = Math.max(maxDist, Math.min(fromLeft[i], fromRight[i]));
            
        }
        
        return maxDist;
        
   
        
    }
}
