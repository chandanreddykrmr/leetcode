class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int hold = 0;
        int search = 0;
        
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i] && i != j){
                    count++;
                }
            }
            list.add(count);
        }
        
        int[] result = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            result[k] = list.get(k);
        }
        return result;
    }
}