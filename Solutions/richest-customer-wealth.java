//https://leetcode.com/problems/richest-customer-wealth/
class richest-customer-wealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0; //init max
        for(int i=0; i<accounts.length; i++){
            int wealth = 0; //init wealth, set to 0 when loop starts again
            for(int j=0; j<accounts[0].length; j++){
                wealth += accounts[i][j]; //as wealth accumulates
            }

            if(wealth > max){
                max = wealth; //check if wealth is greater than max
            }
        }
        return max; //return max
    }
}