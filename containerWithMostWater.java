class Solution {
    public int maxArea(int[] height) {
        int maxheight = 0;
        int l = 0;
        int r = height.length-1;
        
        while(l!=r) {
            maxheight = Math.max((r-l)*Math.min(height[l], height[r]), maxheight);
        if (height[l]>height[r]) {
            r--;
        } else {
            l++;
        }
                                                 
     }
        return maxheight;
        
        
        
}
                                 
                                 
                                 
                                 
     
                                 
                                 }
