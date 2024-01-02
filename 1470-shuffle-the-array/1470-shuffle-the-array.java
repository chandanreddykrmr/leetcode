class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] res = new int[nums.length];
       
        for(int i=0, j=0, k=n; i < res.length; i++){
            res[i]= i%2 == 0 ? nums[j++] : nums[k++];
           
        }
        
        return res;
        
    }
}