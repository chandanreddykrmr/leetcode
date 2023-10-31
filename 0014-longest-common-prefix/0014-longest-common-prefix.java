class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs[0].length();
        
        // for every element in array check
        for(int i = 1; i < strs.length; i++){
            length = Math.min(length, strs[i].length());
            
            for(int j = 0; j < length; j++){
                char c = strs[0].charAt(j);
                char d = strs[i].charAt(j);
                
                if(c != d){
                    length = j;
                    break;
                }
            }
        }
        
        return strs[0].substring(0, length);
    }
}