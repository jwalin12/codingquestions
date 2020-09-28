class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length < 3) {
            return 0;
        }
        
        else{
            for(int i = 1; i < arr.length-1; i++) {
                
                if (arr[i] > arr[i+1] && arr[i] > arr[i-1]) {
                    return i;
                }
                
            }
            
            
        }
        
        return 1;
        
    }
}
