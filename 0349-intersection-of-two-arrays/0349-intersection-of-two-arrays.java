class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
            
        int point1 = 0;
        int point2 = 0;
        
        ArrayList<Integer> c = new ArrayList<>();
        
        while(point1 < nums1.length && point2 < nums2.length){
            if(nums1[point1] == nums2[point2]){
                if(c.contains(nums1[point1])){
                    int x = nums1[point1];
                    c.removeIf(e -> e.equals(x));
                    c.add(nums1[point1]);
                    point1++;
                    point2++;
                }else{
                    c.add(nums1[point1]);
                    point1++;
                    point2++;
                }
            }else if(nums1[point1] < nums2[point2]){
                    point1++;
                }else{
                    point2++;
                }
        }
        
        int[] result = new int[c.size()];
        for(int i = 0; i<c.size(); i++){
            result[i] = c.get(i);
        }
        
        return result;
    }
}