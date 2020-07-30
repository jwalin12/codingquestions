class Solution {
    public int countPrimes(int n) {
        
        
        if (n < 3) {
            return 0;
        }
       
        
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime = sieve(isPrime);
        int count = 0;
        
        for (int i =2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                count++;
            }
            
        }
        
        return count;
        
        
        
        
    }
    
    public boolean[] sieve(boolean[] isPrime) {
        int start = 4;
        int prime = 2;
       

        while (start < isPrime.length) {
            for (int i =start; i < isPrime.length; i+=prime) {
                isPrime[i] = false;
                
                
            }
            for (int i = prime + 1; i <isPrime.length; i++) {
                if (isPrime[i]) {
                    System.out.println(i);
                   
                    prime = i;
                    start = i*i;
                    break;
                }
            }
           
            
            
        }
        
        return isPrime;
        
        
    }
}
