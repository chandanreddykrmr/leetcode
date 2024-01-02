class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] res = new int[nums.length];
       
        for(int i=0, j=0, k=n; i < res.length; i++){
            if(i % 2 == 0){
                res[i] = nums[j++];
            }else{
                res[i] = nums[k++];
            }
        }
        
        return res;
        
    }
}