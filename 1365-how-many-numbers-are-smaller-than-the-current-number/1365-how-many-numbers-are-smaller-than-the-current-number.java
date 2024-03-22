class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i] && i != j){
                    count++;
                }
            }
            // list.add(count);
            result[i] = count;
        }
       
        
        
//         for(int k = 0; k < list.size(); k++){
//             result[k] = list.get(k);
//         }
        return result;
    }
}