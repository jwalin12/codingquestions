class Solution {
    public List<String> letterCombinations(String digits) {
        Map <Character, List<String>> digitToLetter = new HashMap<Character, List<String>>();
        digitToLetter.put('2', Arrays.asList("a", "b", "c"));
        digitToLetter.put('3', Arrays.asList("d", "e", "f"));
        digitToLetter.put('4', Arrays.asList("g", "h", "i"));
        digitToLetter.put('5', Arrays.asList("j", "k", "l"));
        digitToLetter.put('6', Arrays.asList("m", "n", "o"));
        digitToLetter.put('7', Arrays.asList("p", "q", "r", "s"));
        digitToLetter.put('8', Arrays.asList("t", "u", "v"));
        digitToLetter.put('9', Arrays.asList("w", "x", "y", "z"));
        return letterCombinationsHelper(digits, digitToLetter, new ArrayList<String>());
        
    }
    
    public List<String> letterCombinationsHelper(String digits, Map<Character, List<String>> digitToLetter,List<String>combinationsSoFar) {
        if(digits.length()==0) {
            return combinationsSoFar;
        }
        if(combinationsSoFar.isEmpty()) {
            combinationsSoFar = new ArrayList<String>();
            List<String>letters = digitToLetter.get(digits.charAt(0));
            
            for(String s:letters) {
                combinationsSoFar.add(s);
                
            }
            return letterCombinationsHelper(digits.substring(1), digitToLetter,combinationsSoFar);
            
        } else {
            List<String>letters = digitToLetter.get(digits.charAt(0));
            List<String> NewcombinationsSoFar = new ArrayList<String>();
            for (String letter:letters){
                for (String comb: combinationsSoFar){
                    NewcombinationsSoFar.add(comb + letter);
                }
            }
            
            return letterCombinationsHelper(digits.substring(1), digitToLetter, NewcombinationsSoFar);
            
        }
    }
    
    
    
    
    
}
