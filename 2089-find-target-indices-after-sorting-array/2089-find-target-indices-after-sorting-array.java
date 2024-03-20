class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> list = new LinkedList<Integer>(); 
        int left = 0;
        int right = nums.length - 1;
        
        for (int num : nums) {
        list.add(num);
    }
    Collections.sort(list);
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for(int i = 0; i < list.size(); i++){
           if(list.get(i) == target){
               a.add(i);
           }
        }
        
        return a;
    }
}