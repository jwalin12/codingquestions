class Solution {
    public boolean isHappy(int n) {
        return helper(n, new HashSet<Integer>());
        
       
        
    }
    
    
    
    public boolean helper(int n, HashSet<Integer> sums) {
         if (n==1) {
            return true;
        }
        else {
            int nextsum = 0;
            while(n>0) {
                nextsum+=(n%10)*(n%10);
                n = n/10;
                
            }
            System.out.println(nextsum);
            if (sums.contains(nextsum)) {
                return false;
            } else {
                sums.add(nextsum);
                return helper(nextsum, sums);
            }
        }
    }
}
