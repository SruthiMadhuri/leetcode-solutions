class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] row:accounts){
            int sum = 0;
            for(int i:row) 
                sum+=i;
            max = Math.max(sum,max);
    }
    return max;
}
}