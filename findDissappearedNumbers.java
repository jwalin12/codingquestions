class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet <Integer> set = new HashSet <Integer>();
        List <Integer> output = new ArrayList<Integer>();
        
        
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i =1; i < nums.length +1; i++) {
            if(!set.contains(i)) {
                output.add(i);
                
            }
        }
        return output;
        
    }
}
