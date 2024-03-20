class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       int belowCount = 0;
        int totalCount= 0;
        
        for(int i= 0; i < nums.length; i++){
            if(nums[i] == target){
                totalCount++;
            }else if(nums[i] < target){
                belowCount++;
            }
        }
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int j = 0; j < totalCount; j++){
            a.add(belowCount++);
        }
        
        return a;
    }
}