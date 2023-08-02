class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Permutation(0,nums,res);
        return res;
    }
    private void Permutation(int i, int[] nums,List<List<Integer>> res){
        if(i==nums.length-1)
        {
            List<Integer> list = new ArrayList<>();
            for(int n:nums)list.add(n);
            res.add(list);
        }else{
            for(int j=i,l=nums.length;j<l;j++){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                Permutation(i+1,nums,res);
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
    }
}
