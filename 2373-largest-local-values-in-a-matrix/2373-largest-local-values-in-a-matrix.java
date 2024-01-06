class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length - 2;
        int[][] maxLocal = new int[len][len];
        
        
        for(int i =0; i<len; i++){
            for(int j=0; j< len; j++){
                int pp = 0;
                
                for(int k=i; k<i+3; k++ ){
                    for(int l=j; l< j+3; l++){
                        pp=Math.max(pp,grid[k][l]);
                    }
                }
                maxLocal[i][j]= pp;
                
                
            }
        }
        
        return maxLocal;
               
    }
}