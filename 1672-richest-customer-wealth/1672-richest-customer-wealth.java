class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich=0;
        
        int[] rc = new int[accounts.length];
        
        for(int i = 0; i < accounts.length; i++){
            int d = 0;
            for(int j=0; j< accounts[i].length; j++){
                d = d + accounts[i][j];
            }
            rc[i]=d;
        }
        
        rich = rc[0];
        for(int k = 1; k < rc.length; k++){
            if(rich < rc[k]){
                rich = rc[k];
            }
        }
        
        return rich;
    }
}