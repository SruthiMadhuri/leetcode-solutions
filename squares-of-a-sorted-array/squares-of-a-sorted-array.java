class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        int left = 0, right = n-1;
        for(int i=n-1;i>=0;i--){
            int start=nums[left]*nums[left];
            int end = nums[right]*nums[right];
            if(start>end){
                res[i]=start;
                left++;
            }
            else{
                res[i]=end;
                right--;
            }
        }
        return res;
        
    }
}