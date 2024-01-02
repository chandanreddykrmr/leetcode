class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] res = new int[nums.length];
        int i = 0;
        int j = n;
        for(int k =0; k < res.length; k++){
            res[k]= nums[i];
            k++;
            res[k] = nums[j];
            i++;
            j++;
        }
        
        return res;
        
    }
}