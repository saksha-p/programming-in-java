class Solution {
    public int[] twoSum(int[] num, int targ) {
          Map<Integer, Integer> numMap = new HashMap<>();
        
     
        for (int i = 0; i < num.length; i++) {
          
            int comp = target - num[i];
            
           
            if (numMap.containsKey(comp)) {
               
                return new int[] { numMap.get(comp), i };
            }
            
            
            numMap.put(num[i], i);
        }
        
        return new int[0];
    }
}
