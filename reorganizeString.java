class Solution {
    public String reorganizeString(String S) {
        System.out.println(S);
        if (S.length() ==0 || S.length() ==1) {
            System.out.println("this case");
            return S;
        }
        
        HashMap <String, Integer> occurences = new HashMap<String, Integer>();
        for(int i= 0; i < S.length(); i++) {
            occurences.put(S.substring(i, i+1), occurences.getOrDefault(S.substring(i, i+1),0) +1);
        }
        System.out.println(occurences);
        PriorityQueue <String> sorted = new PriorityQueue <String> ((x,y) ->Integer.compare(occurences.get(y), occurences.get(x)));
        for (int i = 0; i < S.length(); i++) {
            if (occurences.get(S.substring(i, i+1)) > (S.length() +1)/2) {
                return "";
                
            }
            if (!sorted.contains(S.substring(i, i+1))) {
                sorted.add(S.substring(i, i+1));
            }   
        }
        
        String output = "";
        
        while(sorted.size() >=2) {
            String s1 = sorted.poll();
            String s2 = sorted.poll();
            output += s1;
            output += s2;
            occurences.put(s1, occurences.get(s1)-1);
            occurences.put(s2, occurences.get(s2) -1);
            if (occurences.get(s1) > 0) {
                sorted.add(s1);
            }
            if(occurences.get(s2) > 0) {
                sorted.add(s2);
            }
        
            
        }
        if(sorted.size()>0) {
            output += sorted.poll();
        }
        
        
        
      
return output;
       
    
}
    

        
        
        
        
        
        
        
    }
